package com.time_to_help.time_to_help.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Announcement {
    @Id
    private int id;
    private String name;
    private String description;
    private double price;
    private double donations;
    private String image;

}
