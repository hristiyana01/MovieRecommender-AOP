package com.example.movierecommenderaop;

import dataLayer.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FilteringTechnique2 {
    @Autowired
    private User user;

    public String contentBasedFiltering() {
        String userDetails = user.getUserDetails();
        return userDetails;
    }
}
