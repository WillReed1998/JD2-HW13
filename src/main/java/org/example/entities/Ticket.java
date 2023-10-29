package org.example.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "tickets")
@Data
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private Long id;

    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private String createdAt;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    @ManyToOne
    @JoinColumn(name = "from_planet_id")
    private Planet fromPlanet;

    @ManyToOne
    @JoinColumn(name = "to_planet_id")
    private Planet toPlanet;

}