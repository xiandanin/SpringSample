package com.example.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("config")
public class GlobalConfig {

    @Value("${spring.profiles.active}")
    String profilesActive;

    @Value("${text}")
    String text;

    public String getProfilesActive() {
        return profilesActive;
    }

    public String getText() {
        return text;
    }
}
