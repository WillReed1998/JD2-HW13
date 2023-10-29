package org.example;

import org.flywaydb.core.Flyway;

import static org.example.Config.*;

public class DatabaseMigration {
    public static void fwMigration(){

        Flyway.configure()
                .dataSource(jdbcUrl, username, password)
                .locations("classpath:src/main/resources/db/migration")
                .baselineOnMigrate(true)
                .load()
                .migrate();


    }
}