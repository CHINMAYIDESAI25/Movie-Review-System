package com.example.UserRating.Controller;

import com.example.UserRating.Entity.UserRating;
import com.example.UserRating.Service.UserRatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/userratings")
public class UserRatingController {
    private final UserRatingService userRatingService;

    @Autowired
    public UserRatingController(UserRatingService userRatingService) {
        this.userRatingService = userRatingService;
    }

    @GetMapping("/user/{userId}")
    public List<UserRating> getUserRatingsByUserId(@PathVariable Long userId) {
        return userRatingService.getUserRatingsByUserId(userId);
    }

    @PostMapping
    public UserRating createUserRating(@RequestBody UserRating userRating) {
        return userRatingService.createUserRating(userRating);
    }

    @DeleteMapping("/{id}")
    public void deleteUserRating(@PathVariable Long id) {
        userRatingService.deleteUserRating(id);
    }
}
