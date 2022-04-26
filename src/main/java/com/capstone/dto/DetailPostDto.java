package com.capstone.dto;

import lombok.Getter;

import java.time.LocalTime;

@Getter
public class DetailPostDto {
    private String title;
    private String category;
    private String name;
    private String rName;
    private LocalTime order_time;
    private int minPrice;

}
