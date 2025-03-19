package com.sprigmvc.service.Impl;

import com.sprigmvc.service.AnimalService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * Edited in:2025/2/27
 * PACKAGE_NAME:springboot-quick-start
 * description:
 */
@Service
public class AnimalServiceImpl implements AnimalService {
    @Override
    public Map<String, Integer> calculate(int heads, int legs) {
        int rabbits = legs / 2 - heads;
        int chickens = heads - rabbits;
        Map<String, Integer> result = new HashMap<>();
        if (rabbits >= 0 && chickens >= 0){
            result.put("chickens", chickens);
            result.put("rabbits", rabbits);
        }
        return result;
    }
}
