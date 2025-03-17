package com.javalearning.springmvcprojectsfruit.controller;

import com.javalearning.springmvcprojectsfruit.pojo.Fruit;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/convertAndFormat/homework")
public class HomeworkController {
    @PostMapping(value = "/convert", produces = "application/json; charset=utf-8")
    public Fruit convert(@RequestParam Fruit fruit, @RequestParam Float price) {
        fruit.setPrice(price);
        return fruit;
    }
}