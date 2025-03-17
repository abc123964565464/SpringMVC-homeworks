package com.javalearning.springmvcprojectsfruit.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Fruit {
    private String caption;
    private String original;
    private Float price;
}
