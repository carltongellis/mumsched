INSERT INTO role (role_id, role) VALUES (1, 'ADMIN');
INSERT INTO user (user_id, active, email, last_name, name, password) VALUES (1, 1, 'wisletmichel@gmail.com', 'Michel', 'Wislet', '$2a$10$M02LFt7qSFjCthQjnnApweltBPmwyxruPYccFyNQrkif9pR554yF6');
INSERT INTO user_role (user_id, role_id) VALUES (1, 1);