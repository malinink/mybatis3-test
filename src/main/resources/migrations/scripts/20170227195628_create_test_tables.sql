-- // create_users_table

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

-- //@UNDO

DROP TABLE users;
DROP TABLE groups;