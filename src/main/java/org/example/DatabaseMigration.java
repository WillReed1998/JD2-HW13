package org.example;

import org.flywaydb.core.Flyway;

import static org.example.Config.*;

public class DatabaseMigration {
    public static void fwMigration(){

        Flyway flyway = Flyway.configure()
                .dataSource(jdbcUrl, username, password)
                .locations("classpath:db/migration")
                .baselineOnMigrate(true)
                .load();

        flyway.migrate();
    }
}