package com.example.ServiceFeedback.controller;

import com.example.ServiceFeedback.model.Review;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reviews")
public class ReviewController {

    @GetMapping("/{productId}")
    public ResponseEntity<List<Review>> getReviews(@PathVariable Long productId) {
        List<Review> reviews = List.of(
                new Review(productId, "Excellent product!", 5),
                new Review(productId, "Good value for money", 4)
        );
        return ResponseEntity.ok(reviews);
    }

    @PostMapping
    public ResponseEntity<Review> addReview(@RequestBody Review review) {
        return ResponseEntity.ok(review);
    }
}
