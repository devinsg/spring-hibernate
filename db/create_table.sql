DROP TABLE conf_user;
CREATE TABLE conf_user
(
    id          INT PRIMARY KEY,
    first_name  VARCHAR(30) NOT NULL,
    last_name   VARCHAR(30) NOT NULL,
    age         INT DEFAULT 0
);

DROP TABLE conf_registration;
CREATE TABLE conf_registration
(
    id          INT PRIMARY KEY,
    name        VARCHAR(50) NOT NULL,
    description VARCHAR(50) DEFAULT NULL,
    user_id     INT NOT NULL,
    from_date   DATE DEFAULT NULL,
    to_date     DATE DEFAULT NULL
);

DROP TABLE conf_course;
CREATE TABLE conf_course
(
    id              INT PRIMARY KEY,
    name            VARCHAR(50) NOT NULL,
    description     VARCHAR(50) DEFAULT NULL,
    registration_id INT NOT NULL,
    total_hours     INT DEFAULT 0
);


