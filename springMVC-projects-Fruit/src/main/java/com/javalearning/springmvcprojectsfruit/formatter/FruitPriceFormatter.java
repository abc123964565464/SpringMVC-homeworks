package com.javalearning.springmvcprojectsfruit.formatter;

import org.springframework.format.Formatter;
import java.text.ParseException;
import java.util.Locale;

public class FruitPriceFormatter implements Formatter<Float> {
    @Override
    public Float parse(String text, Locale locale) throws ParseException {
        try {
            String cleaned = text.replaceAll("[^\\d.]", "");
            return Float.parseFloat(cleaned);
        } catch (NumberFormatException e) {
            throw new ParseException("Invalid price format: " + text, 0);
        }
    }

    @Override
    public String print(Float object, Locale locale) {
        return object.toString();
    }
}