package com.sprigmvc.controller;


import com.sprigmvc.pojo.Animal;
import com.sprigmvc.pojo.Result;
import com.sprigmvc.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/calculate")
public class AnimalController {

    @Autowired
    private AnimalService animalService;

    // 路径传参
    @PostMapping("/path/{heads}/{legs}")
    public Result pathParam(@PathVariable int heads, @PathVariable int legs) {
        return calculateResult(heads, legs);
    }

    //请求参数
    @PostMapping("/param")
    public Result byParam(@RequestParam int heads, @RequestParam int legs) {
        return calculateResult(heads, legs);
    }

    //对象传参
    @PostMapping("/object")
    public Result byObject(@RequestBody Animal animal) {
        return calculateResult(animal.getHeads(), animal.getLegs());
    }

    // 参数校验
    private Result calculateResult(int heads, int legs) {
        if (heads < 0 || legs < 0 || legs % 2 != 0 || legs < 2 * heads) {
            return new Result(400, "Invalid input", null);
        }
        Map<String, Integer> data = animalService.calculate(heads, legs);
        return new Result(200, "Invalid input", data);
    }
}
