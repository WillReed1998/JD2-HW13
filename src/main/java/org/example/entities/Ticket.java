package org.example.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name = "tickets")
@Data
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private String id;

    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;

    @ManyToOne
    @JoinColumn(name = "client_id", nullable=false)
    private Client client;

    @ManyToOne
    @JoinColumn(name = "from_planet_id", nullable=false)
    private Planet fromPlanet;

    @ManyToOne
    @JoinColumn(name = "to_planet_id", nullable=false)
    private Planet toPlanet;
}