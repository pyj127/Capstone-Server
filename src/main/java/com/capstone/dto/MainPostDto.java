package com.capstone.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class MainPostDto {
    private String title;
    private String rName;
    private LocalDateTime orderTime;
    private String category;
    private int minPrice;
}
