package com.example.Sec_Spring.auth;

import org.springframework.stereotype.Component;

import java.util.Optional;


public interface ApplicationUserDao {

     Optional<ApplicationUser> selectApplicationUserByUsername(String username);
}
