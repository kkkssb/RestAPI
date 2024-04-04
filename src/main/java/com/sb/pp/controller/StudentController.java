package com.sb.pp.controller;
import java.lang.System;
import java.lang.*;
import java.util.List;

import com.sb.pp.domain.dto.StudentDTO;
import com.sb.pp.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
}

