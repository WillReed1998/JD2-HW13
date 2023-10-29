package org.example;

import org.example.CRUD.ClientCrudService;
import org.example.CRUD.PlanetCrudService;
import org.example.entities.Client;
import org.example.entities.Planet;
import org.example.flyway.DatabaseMigration;

public class App {
    public static void main(String[] args) {

        DatabaseMigration databaseMigration = new DatabaseMigration();
        DatabaseMigration.fwMigration();

        ClientCrudService clientCrudService = new ClientCrudService();
        Client newClient = new Client();
        newClient.setName("Client11");
        clientCrudService.create(newClient);
        clientCrudService.delete(newClient);

        PlanetCrudService planetCrudService = new PlanetCrudService();
        Planet newPlanet = new Planet();
        newPlanet.setId("PL6");
        newPlanet.setName("Planet6");
        planetCrudService.create(newPlanet);
        planetCrudService.delete(newPlanet);
    }
}