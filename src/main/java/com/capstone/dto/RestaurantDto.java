package com.capstone.dto;

import lombok.Getter;

@Getter
public class RestaurantDto {
    private int rId;
    private String rName;
    private String category;
    private int minPrice;
    private String orderFee;

    @Override
    public String toString() {
        return "RestaurantDto{" +
                "rId=" + rId +
                ", rName='" + rName + '\'' +
                ", category='" + category + '\'' +
                ", minPrice=" + minPrice +
                ", orderFee='" + orderFee + '\'' +
                '}';
    }
}
