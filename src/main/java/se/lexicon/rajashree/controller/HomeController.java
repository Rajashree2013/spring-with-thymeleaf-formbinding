package se.lexicon.rajashree.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import se.lexicon.rajashree.model.Customer;

import java.time.LocalDate;

@Controller
public class HomeController {
    @RequestMapping(value = "/" , method = RequestMethod.GET)
    public String defaultURL() {

        System.out.println("##### default method has been executed ####");
        System.out.println("step 1--------------");
        return "index";
    }


    @GetMapping("/customer")
    public String getCustomer(Model model) {
        Customer customer = new Customer();
        model.addAttribute("customer", customer);
        return "customerForm";
    }

}
