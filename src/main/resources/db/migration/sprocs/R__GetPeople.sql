DROP PROCEDURE IF EXISTS GetPeople;
DELIMITER //
CREATE PROCEDURE GetPeople()
  BEGIN
    SELECT * FROM person;
  END //
DELIMITER ;