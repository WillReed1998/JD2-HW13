package org.example.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "planets")
@Data
public class Planet {
    @Id
    @Column (name = "id", length = 50)
    private String id;

    @Column(name = "name", length = 200)
    private String name;
}