package com.example.proxy.security

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.core.userdetails.User
import org.springframework.security.provisioning.InMemoryUserDetailsManager
import org.springframework.security.web.SecurityFilterChain

@Configuration
@EnableWebSecurity
class SecurityConfig {

    @Bean
    fun userDetailService() = InMemoryUserDetailsManager(
        User.withUsername("admin")
            .password("{noop}123")//{noop} significa sem encoder
            .roles("USER")
            .build()
    )

    @Bean
    fun filterChain(http : HttpSecurity) : SecurityFilterChain{
        return http.csrf { it.disable() }
            .authorizeHttpRequests {
                it.requestMatchers("/auth/**").permitAll()
                it.anyRequest().authenticated()
            }.httpBasic {  }.build()
    }
}