package com.sprigmvc.pojo;

import lombok.Data;

import java.util.Map;

/**
 * Edited in:2025/2/27
 * PACKAGE_NAME:springboot-quick-start
 * description:
 */
@Data
public class Result {
    private int code;
    private String msg;
    private Map<String,Integer> data;

    public Result(int code, String msg, Map<String, Integer> data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
}
