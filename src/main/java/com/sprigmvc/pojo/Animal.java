package com.sprigmvc.pojo;

import lombok.*;

/**
 * Edited in:2025/2/27
 * PACKAGE_NAME:springboot-quick-start
 * description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Animal {
    private Integer heads;
    private Integer legs;


    public int getHeads() {
        return heads;
    }

    public void setHeads(int heads) {
        this.heads = heads;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }
}
