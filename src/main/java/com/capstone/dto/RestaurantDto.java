package com.capstone.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class RestaurantDto {
    @JsonProperty("r_id")
    private int rId;
    @JsonProperty("r_name")
    private String rName;
    private String category;
    @JsonProperty("min_price")
    private int minPrice;
    @JsonProperty("order_fee")
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
