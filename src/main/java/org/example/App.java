package org.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        DatabaseMigration databaseMigration = new DatabaseMigration();
        DatabaseMigration.fwMigration();
        //Scanner scanner = new Scanner(System.in);
       //scanner.nextLine();
    }
}