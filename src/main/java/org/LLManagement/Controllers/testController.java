package org.LLManagement.Controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class testController {
    @GetMapping("hello")
    public String home(){
        return"index";
    }
}
