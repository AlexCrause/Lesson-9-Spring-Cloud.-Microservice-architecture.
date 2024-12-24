package com.example.ServiceFeedback.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Review {

    private Long productId;
    private String comment;
    private int rating;
}
