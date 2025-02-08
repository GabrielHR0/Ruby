package com.gymmanager.ruby.model.user;

import java.time.LocalDate;


import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter private String Long;

    @JoinColumn(nullable = false)
    @Getter @Setter private String userName;

    @JoinColumn(nullable = false)
    @Getter @Setter private String password;

    @JoinColumn(unique = true, nullable = false)
    @Getter @Setter private String email;

    @Enumerated(EnumType.STRING)
    @Getter @Setter private Role role;

    @Getter @Setter private LocalDate createdDate;

    //@JsonIgnore
    @JsonIgnore @Getter @Setter private boolean isActive;
    //@JsonIgnore
    @JsonIgnore @Getter @Setter private boolean isBlocked;
    @JsonIgnore @Getter @Setter private String  secretQuestion;
    @JsonIgnore @Getter @Setter private String  secretAnswer;
    @JsonIgnore @Getter @Setter private boolean enableBetaTesting;


    public User(String userName, String password, String email, Role role,
    boolean isActive, boolean isBlocked, String secretQuestion, String secretAnswer, boolean enableBetaTesting) {
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.role = role;
        this.isActive = isActive;
        this.isBlocked = isBlocked;
        this.secretQuestion = secretQuestion;
        this.secretAnswer = secretAnswer;
        this.enableBetaTesting = enableBetaTesting;
    }
    
}
