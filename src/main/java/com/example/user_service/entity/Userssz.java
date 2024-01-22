package com.example.user_service.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data

public class Userssz {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO  )

    private Long userId;
    private String firstName;
    private String lastName;
    private Long departmentId;


}
