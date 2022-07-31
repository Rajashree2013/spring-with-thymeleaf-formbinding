package se.lexicon.rajashree.controller;


import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import se.lexicon.rajashree.model.dto.CustomerForm;

import javax.validation.Valid;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    @PostMapping("/register")
    public String add(@ModelAttribute("customer") @Valid CustomerForm customerForm, BindingResult bindingResult, RedirectAttributes redirectAttributes) {
        System.out.println("customerForm = " + customerForm);

        if (bindingResult.hasErrors()) {
            System.out.println("step error : " + bindingResult.hasErrors());
            return "/customer/customerForm";
        }

        return "customerDetails";
    }

}

