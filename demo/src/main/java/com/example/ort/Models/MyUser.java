package com.example.ort.Models;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;

@Data
@Entity
public class MyUser {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;
    String username;
    String password;
    String role;
}
