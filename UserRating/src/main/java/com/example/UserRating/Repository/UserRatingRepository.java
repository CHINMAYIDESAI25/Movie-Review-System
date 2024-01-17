package com.example.UserRating.Repository;

import com.example.UserRating.Entity.UserRating;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRatingRepository extends JpaRepository<UserRating, Long> {
    List<UserRating> findByUserId(Long userId);
}

