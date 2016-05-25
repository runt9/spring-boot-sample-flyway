ALTER TABLE person ADD email_address VARCHAR(255) DEFAULT NULL;
UPDATE person SET email_address = 'test@test.com' WHERE id = 1;