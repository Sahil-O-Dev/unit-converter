package com.sahil.unitconverter.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UnitController
{
    @GetMapping("/")
    public String home()
    {
        return "home";
    }

    @GetMapping("/length")
    public String lengthPage()
    {
        return "length";
    }

}
