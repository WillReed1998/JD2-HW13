package org.example;

import org.example.crud.ClientCrudService;
import org.example.crud.PlanetCrudService;
import org.example.crud.TicketCrudService;
import org.example.entities.Client;
import org.example.entities.Planet;
import org.example.entities.Ticket;
import org.example.flyway.DatabaseMigration;

import java.util.Date;

public class App {
    public static void main(String[] args) {

        DatabaseMigration databaseMigration = new DatabaseMigration();
        DatabaseMigration.fwMigration();

        ClientCrudService clientCrudService = new ClientCrudService();
        Client newClient = new Client();
        newClient.setName("Client11");
        clientCrudService.create(newClient);
        //clientCrudService.delete(newClient);

        PlanetCrudService planetCrudService = new PlanetCrudService();
        Planet newPlanet = new Planet();
        newPlanet.setId("PL6");
        newPlanet.setName("Planet6");
        planetCrudService.create(newPlanet);
        //planetCrudService.delete(newPlanet);

        TicketCrudService ticketCrudService = new TicketCrudService();
        Ticket newTicket = new Ticket();
        Client clientForTicket = clientCrudService.read(1);
        Planet fromPlanetForTicket = planetCrudService.read("Planet4");
        Planet toPlanetForTicket = planetCrudService.read("Planet5");

        newTicket.setId("11");
        newTicket.setCreatedAt(new Date(2023, 10, 29, 10, 0, 0));
        newTicket.setClient(clientForTicket);
        newTicket.setFromPlanet(fromPlanetForTicket);
        newTicket.setToPlanet(toPlanetForTicket);
        ticketCrudService.create(newTicket);
        //ticketCrudService.delete(newPlanet);
    }
}