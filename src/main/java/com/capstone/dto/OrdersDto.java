package com.capstone.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class OrdersDto {
    @JsonProperty("u_id")
    private int uId;
    @JsonProperty("p_id")
    private int pId;
    private String menu;
    private int price;
    private String request;
    private int fee;

    @Override
    public String toString() {
        return "OrderDto{" +
                "uId=" + uId +
                ", pId='" + pId + '\'' +
                ", menu='" + menu + '\'' +
                ", price=" + price +
                ", request='" + request + '\'' +
                ", fee=" + fee +
                '}';
    }
}
