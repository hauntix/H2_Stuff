DROP TABLE IF EXISTS alien;

CREATE TABLE alien (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  species VARCHAR(250) NOT NULL,
  planet VARCHAR(250) NOT NULL
);

INSERT INTO alien (name, species, planet) VALUES
  ('Zuckerburg', 'LizardMan', 'GJ 180 c'),
  ('Carlos', '???', 'CoRoT-7 b')
