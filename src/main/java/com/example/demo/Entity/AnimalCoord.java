package com.example.demo.Entity;

import lombok.Data;

import javax.persistence.Entity;

@Data

public class AnimalCoord {

    private String type;
    private String race;
    private float latitude;
    private float longitude;
    private String datetime;

}
