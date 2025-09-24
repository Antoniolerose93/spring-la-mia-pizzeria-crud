package org.pizzeria.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.pizzeria.demo.model.Pizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.pizzeria.demo.repository.PizzaRepository;

@Controller
@RequestMapping("/pizze")
public class Pizzacontroller {

    @Autowired
    private PizzaRepository repository;

@GetMapping
public String index (Model model) {
    List<Pizza> result = repository.findAll();
    model.addAttribute("list", result);
    return "/pizze/index";
}


    
}
