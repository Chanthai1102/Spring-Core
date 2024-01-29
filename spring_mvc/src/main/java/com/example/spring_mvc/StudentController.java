package com.example.spring_mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {
    @RequestMapping(value = "/students")
    public String displayStudent(Model model){
        model.addAttribute("Welcome", "Hello");
        //System.out.println("Student display");
        return "students"; // view name
    }
}
