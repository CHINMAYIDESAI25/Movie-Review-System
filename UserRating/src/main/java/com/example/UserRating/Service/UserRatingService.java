package com.example.UserRating.Service;

import com.example.UserRating.Entity.UserRating;
import com.example.UserRating.Repository.UserRatingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserRatingService {
    private final UserRatingRepository userRatingRepository;

    @Autowired
    public UserRatingService(UserRatingRepository userRatingRepository) {
        this.userRatingRepository = userRatingRepository;
    }

    public List<UserRating> getUserRatingsByUserId(Long userId) {
        return userRatingRepository.findByUserId(userId);
    }

    public UserRating createUserRating(UserRating userRating) {
        return userRatingRepository.save(userRating);
    }

    public void deleteUserRating(Long id) {
        userRatingRepository.deleteById(id);
    }
}
