package com.example.Backend;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class hola {
    @RequestMapping("/Hola")
    @ResponseBody
    String home(){

        return "Hola mundo";
    }
}
