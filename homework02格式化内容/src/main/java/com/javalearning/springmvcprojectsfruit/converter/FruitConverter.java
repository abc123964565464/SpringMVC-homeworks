package com.javalearning.springmvcprojectsfruit.converter;

import com.javalearning.springmvcprojectsfruit.pojo.Fruit;
import org.springframework.core.convert.converter.Converter;

public class FruitConverter implements Converter<String, Fruit> {
    @Override
    public Fruit convert(String source) {
        String[] parts = source.split(":");
        if (parts.length != 2) {
            throw new IllegalArgumentException("格式输入错误...'");
        }
        Fruit fruit = new Fruit();
        fruit.setOriginal(parts[1]);
        fruit.setCaption(parts[0]);
        return fruit;
    }
}