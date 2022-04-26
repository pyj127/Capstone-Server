package com.capstone.dto;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class DetailPostDto {
    private String title;
    private String category;
    private String name;
    private String rName;
    private LocalDateTime order_time;
    private int minPrice;

}
