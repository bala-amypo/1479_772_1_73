package com.example.demo.service;

import com.example.demo.model.*;
import com.example.demo.repository.*;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class UserService {

    private final UserRepository userRepo;
    private final RoleRepository roleRepo;
    private final PasswordEncoder encoder;

    public UserService(UserRepository userRepo,
                       RoleRepository roleRepo,
                       PasswordEncoder encoder) {
        this.userRepo = userRepo;
        this.roleRepo = roleRepo;
        this.encoder = encoder;
    }

    public User registerUser(User user, String roleName) {
        Role role = roleRepo.findByName(roleName).orElseThrow();
        user.setPassword(encoder.encode(user.getPassword()));
        user.setRoles(Set.of(role));
        return userRepo.save(user);
    }
}
