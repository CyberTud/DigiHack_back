package com.example.demo.Entity;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "Animal")
public class Animal {

    @Id
    @GeneratedValue
    private Integer id;

    private Integer userId;
    private String type;
    private String race;
    private float latitude;
    private float longitude;
    private String datatime;
    private String description;


}
