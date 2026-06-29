package com.sahil.unitconverter.controllers;


import com.sahil.unitconverter.services.UnitConverterService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UnitController
{
    private final UnitConverterService unitConverterService;

    public UnitController(UnitConverterService unitConverterService)
    {
        this.unitConverterService = unitConverterService;
    }

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

    @PostMapping("/length")
    public String convertLength(@RequestParam double value, @RequestParam String from, @RequestParam String to, Model model)
    {
        double result = unitConverterService.convertLength(value, from, to);

        model.addAttribute("result", result);

        return "length";
    }


    @GetMapping("/weight")
    public String convertWeight()
    {
        return "weight";
    }

    @PostMapping("/weight")
    public String convertWeight(@RequestParam double value, @RequestParam String from, @RequestParam String to, Model model)
    {
        double result = unitConverterService.convertWeight(value, from, to);

        model.addAttribute("result", result);

        return "weight";
    }

    @GetMapping("/temperature")
    public String convertTemperature()
    {
        return "temperature";
    }

    @PostMapping("/temperature")
    public String convertTemperature(@RequestParam double value, @RequestParam String from, @RequestParam String to, Model model)
    {
        double result = unitConverterService.convertTemperature(value, from, to);

        model.addAttribute("result", result);

        return "temperature";
    }

}
