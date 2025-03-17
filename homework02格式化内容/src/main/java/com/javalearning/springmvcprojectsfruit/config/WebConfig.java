package com.javalearning.springmvcprojectsfruit.config;

import com.javalearning.springmvcprojectsfruit.converter.FruitConverter;
import com.javalearning.springmvcprojectsfruit.formatter.FruitPriceFormatter;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addConverter(new FruitConverter());
        registry.addFormatter(new FruitPriceFormatter());
    }
}