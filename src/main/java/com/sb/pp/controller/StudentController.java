package com.sb.pp.controller;
import java.lang.System;
import java.lang.*;
import java.util.List;

import com.sb.pp.domain.dto.StudentDTO;
import com.sb.pp.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/student/*")
public class StudentController {

    @Autowired
    private StudentService studentService;
    @GetMapping("join")
    public String join1() {
        return "/student/join";
    }
    @PostMapping("join")
    public String join(StudentDTO studentDTO) {
        Long idx = 0L;
        if(studentService.join(studentDTO)){
            System.out.println("afaf");
            return "redirect:/student/login";
        }
        System.out.println("a");

        return "redirect:/student/join";

    }
    @GetMapping("login")
    public String login() {
        return "/student/login";
    }

    @GetMapping("get")
    public String get(Model model){
        List<StudentDTO> list =studentService.getList();
        model.addAttribute("list",list);
        return "/student/get";
    }
    @DeleteMapping("remove/{idx}")
    public ResponseEntity remove(@PathVariable("idx") Long idx){
        if(studentService.remove(idx)){
            return new ResponseEntity(HttpStatus.OK);
        }
        return new ResponseEntity(HttpStatus.OK);
    }
    @GetMapping("modify/{idx}")
    public String Getmodify(@PathVariable("idx") Long idx,Model model){
        StudentDTO info =studentService.getOneList(idx);
        model.addAttribute("info",info);
        return "/student/modify";
    }

    @PatchMapping("modify/{idx}")
    public ResponseEntity modify(@PathVariable("idx") Long idx, @RequestBody StudentDTO studentDTO){
        if(studentService.modify(studentDTO)){
            System.out.println("afaf");
            return new ResponseEntity(HttpStatus.OK);
        }
        System.out.println("a");

        return new ResponseEntity(HttpStatus.OK);

    }
}

