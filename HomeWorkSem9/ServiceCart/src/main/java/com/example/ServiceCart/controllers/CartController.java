package com.example.ServiceCart.controllers;

import com.example.ServiceCart.models.CartItem;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cart")
public class CartController {

    @PostMapping
    public ResponseEntity<String> addItem(@RequestBody CartItem item) {
        return ResponseEntity.ok("Item added to cart");
    }

    @DeleteMapping("/{itemId}")
    public ResponseEntity<String> removeItem(@PathVariable Long itemId) {
        return ResponseEntity.ok("Item removed from cart");
    }

    @GetMapping
    public ResponseEntity<List<CartItem>> getCartItems() {
        List<CartItem> items = List.of(
                new CartItem(1L, 2),
                new CartItem(2L, 1)
        );
        return ResponseEntity.ok(items);
    }
}
