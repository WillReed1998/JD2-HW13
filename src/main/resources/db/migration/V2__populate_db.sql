INSERT INTO clients (name) VALUES
                               ('Client1'),
                               ('Client2'),
                               ('Client3'),
                               ('Client4'),
                               ('Client5'),
                               ('Client6'),
                               ('Client7'),
                               ('Client8'),
                               ('Client9'),
                               ('Client10');

INSERT INTO planets (id, name) VALUES
                                   ('PL1', 'Planet1'),
                                   ('PL2', 'Planet2'),
                                   ('PL3', 'Planet3'),
                                   ('PL4', 'Planet4'),
                                   ('PL5', 'Planet5');

INSERT INTO tickets (created_at, client_id, from_planet_id, to_planet_id) VALUES
                                                                              ('2023-10-29 00:00:00', 1, 'PL1', 'PL2'),
                                                                              ('2023-10-29 01:00:00', 2, 'PL1', 'PL3'),
                                                                              ('2023-10-29 02:00:00', 3, 'PL1', 'PL4'),
                                                                              ('2023-10-29 03:00:00', 4, 'PL1', 'PL5'),
                                                                              ('2023-10-29 04:00:00', 5, 'PL2', 'PL3'),
                                                                              ('2023-10-29 05:00:00', 6, 'PL2', 'PL4'),
                                                                              ('2023-10-29 06:00:00', 7, 'PL2', 'PL5'),
                                                                              ('2023-10-29 07:00:00', 8, 'PL3', 'PL4'),
                                                                              ('2023-10-29 08:00:00', 9, 'PL3', 'PL5'),
                                                                              ('2023-10-29 09:00:00', 10, 'PL4', 'PL5');


