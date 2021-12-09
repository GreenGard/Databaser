CREATE TABLE electriccar (
ID int AUTO_INCREMENT,
brand VARCHAR (30) NOT NULL,
model VARCHAR (50)NOT NULL,
drive_range int NOT NULL ,
acceleration DOUBLE NOT NUll,
luggage_space int NOT NULL,
price int NOT NULL,
PRIMARY KEY (ID))
;

INSERT INTO electriccar
(brand,model,drive_range,acceleration,luggage_space,price)
VALUES
('Tesla','Model_S','663','4.1', '804','909990')
;