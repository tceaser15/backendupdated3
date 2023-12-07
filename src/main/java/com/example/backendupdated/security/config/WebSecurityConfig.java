package com.example.backendupdated.security.config;

import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import com.example.backendupdated.services.AppUserService;


@Configuration
@AllArgsConstructor
@EnableWebSecurity
public class WebSecurityConfig {
    private final AppUserService appUserService;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
        HttpSecurity httpSecurity = http
                .authorizeHttpRequests((authz) -> authz
                        .anyRequest().authenticated())
                .httpBasic(Customizer.withDefaults());
        return http.build();

    }
}
