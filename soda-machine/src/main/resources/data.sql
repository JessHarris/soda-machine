drop table Soda;
CREATE TABLE Soda(id INT NOT NULL auto_increment, name VARCHAR(20) NOT NULL, count INT NOT NULL, primary key(id));
INSERT INTO Soda(name,count) values('Coke','3');
INSERT INTO Soda(name,count) values('Sprite','2');
INSERT INTO Soda(name,count)values('Diet Coke','1');