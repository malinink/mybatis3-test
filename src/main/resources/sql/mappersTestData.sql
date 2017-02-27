----------------------
-- DROP FOREIGN KEYS
----------------------


----------------------
-- DROP TABLES
----------------------
DROP TABLE IF EXISTS students;
DROP TABLE IF EXISTS groups;


----------------------
-- CREATE TABLES
----------------------
CREATE TABLE students (
  id         SERIAL      NOT NULL,
  name       VARCHAR(30) NOT NULL,
  group_id   INTEGER     NOT NULL,
  PRIMARY KEY (id)
);

CREATE TABLE groups (
  id         SERIAL      NOT NULL,
  number     INTEGER     NOT NULL,
  steward_id INTEGER,
  PRIMARY KEY (id)
);


----------------------
-- INSERT DATA
----------------------
INSERT INTO students (name, group_id) VALUES
  ('Name1', 1),
  ('Name2', 1),
  ('Name3', 2);

INSERT INTO groups (number, steward_id) VALUES
  (201, 1),
  (202, 3),
  (203, NULL);

