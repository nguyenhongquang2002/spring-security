package com.example.springsecurity.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AccountLoginDto {
    private long id;
    private String username;
    private String password;
    private int role;
    private String confirmPassword;
}