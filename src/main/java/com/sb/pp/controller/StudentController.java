package com.sb.pp.controller;


import com.sb.pp.domain.dto.StudentDTO;
import com.sb.pp.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
        return "join";
    }
    @PostMapping("join")
    public String join(StudentDTO studentDTO) {
        if(studentService.join(studentDTO)){
            return "/student/login";
        }
        return "/student/join";
    }
}
