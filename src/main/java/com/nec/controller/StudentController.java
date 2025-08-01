package com.nec.controller;

import com.nec.entity.Student;
import com.nec.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class StudentController {

    @Autowired
    private StudentRepository repo;

    @GetMapping("/")
    public String homePage(Model model) {
        model.addAttribute("student", new Student());
        return "index";
    }

    @PostMapping("/save")
    public String saveStudent(@ModelAttribute Student student) {
        repo.save(student);
        return "redirect:/show";
    }

    @GetMapping("/show")
    public String showAll(Model model) {
        model.addAttribute("students", repo.findAll());
        return "show";
    }
}
