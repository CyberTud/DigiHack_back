package com.example.demo.Entity;


import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "User")
public class User {

    @Id
    @GeneratedValue
    private Integer id;

    private String email;
    private String password;
}
