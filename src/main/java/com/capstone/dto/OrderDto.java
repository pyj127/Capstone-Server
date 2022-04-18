package com.capstone.dto;

import lombok.Getter;

@Getter
public class OrderDto {
    private Integer uId;
    private Integer pId;
    private String menu;
    private Integer price;
    private String request;
    private Integer fee;
    private boolean remit;

    @Override
    public String toString() {
        return "OrderDto{" +
                "uId=" + uId +
                ", pId='" + pId + '\'' +
                ", menu='" + menu + '\'' +
                ", price=" + price +
                ", request='" + request + '\'' +
                ", fee=" + fee +
                ", remit=" + remit +
                '}';
    }
}
