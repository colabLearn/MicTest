package com.example.mictest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {
    @GetMapping("/userInput")
    public String showForm(Model model){
        User user = new User();
        model.addAttribute("user", user);

        return "userInput_form";

    }

    @PostMapping("/userInput")
    public String submitForm(@ModelAttribute("user") User user) {

        System.out.println(user);

        return "userInput_success";

    }

}
