package org.example;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "planets")
@Data
public class Planet {
    @Id
    @Column (name = "id", length = 50)
    private Long id;

    @Column(name = "name", length = 200)
    private String name;
}