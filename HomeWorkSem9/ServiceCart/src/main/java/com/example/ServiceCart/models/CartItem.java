package com.example.ServiceCart.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CartItem {

    private Long productId;
    private int quantity;
}
