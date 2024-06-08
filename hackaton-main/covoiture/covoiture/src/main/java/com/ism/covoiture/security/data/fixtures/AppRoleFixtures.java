package com.ism.covoiture.security.data.fixtures;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ism.covoiture.security.services.Services;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class AppRoleFixtures implements CommandLineRunner {
    
    private final Services services;
    
    @Override
    public void run(String... args) throws Exception {
        services.saveRole("conducteur");
        services.saveRole("passager");
        services.saveRole("Admin");
    }
    
}
