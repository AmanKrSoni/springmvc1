package com.cvt.controller;

import com.cvt.model.Customer;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/customers")
public class CustomerController {

    //add initbinder.. to convert trim input strings
    //remove leading and trail whitespace
    //resolve issue for our validation

    @InitBinder
    public void initbinder(WebDataBinder dataBinder){
        StringTrimmerEditor stringTrimmerEditor=new StringTrimmerEditor(true);
        dataBinder.registerCustomEditor(String.class,stringTrimmerEditor);

    }

    @RequestMapping("/showForm")
    public String showForm(Model model){
        model.addAttribute("customer",new Customer());
        return "customer-form";
    }

    @RequestMapping("/processForm")
    public String processForm(
            @Valid@ModelAttribute("customer") Customer customer,
            BindingResult bindingResult
                             )
    {

        System.err.println("Binding Result : "+ bindingResult  +" \n\n\n" );
        return  bindingResult.hasErrors() ? "customer-form" : "customer-confirmation";
    }
}
