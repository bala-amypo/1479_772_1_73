package com.example.demo.security;

import com.example.demo.model.User;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.stereotype.Component;

@Component
public class JwtTokenProvider {

    public String generateToken(User user) {
        return Jwts.builder()
                .setSubject(user.getUsername())
                .claim("userId", user.getId())
                .claim("roles", user.getRoles())
                .signWith(SignatureAlgorithm.HS512, SecurityConstants.SECRET)
                .compact();
    }
}
