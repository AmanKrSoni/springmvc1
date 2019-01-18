package com.cvt.controller;

import com.cvt.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/students")
public class StudentController {

    @RequestMapping("/showForm")
    public String showForm(Model model){

        //create the student object
        Student student=new Student();

        //add attribute to the model
        model.addAttribute("student",student);

        return "student-form";
    }


    @RequestMapping("/processForm")
    public String processForm(@ModelAttribute Student student){

        //log the input data
        System.out.println(student);

        return "student-confirmation-form";

    }
}
