package com.example.springsecurity.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AccountRegisterDto {
    private long id;
    private String username;
    private String passwordHash;
    private int role;
    private String confirmPassword;
}