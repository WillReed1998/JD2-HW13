package org.example;

public class App {
    public static void main(String[] args) {

        DatabaseMigration databaseMigration = new DatabaseMigration();
        DatabaseMigration.fwMigration();
    }
}