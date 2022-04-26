package com.capstone.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

import java.time.LocalTime;

@Getter
public class MainPostDto {
    private String title;
    private String rName;
    @JsonProperty("order_time")
    private LocalTime orderTime;
    private String category;
    @JsonProperty("min_price")
    private int minPrice;
}
