package com.example.springsecurity.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "accounts")
public class Credential {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String accessToken;
    private String refreshToken;
    private long expiredAt;
    private int scope;
}
