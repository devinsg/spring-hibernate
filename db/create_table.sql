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
    conf_name   VARCHAR(50) NOT NULL,
    user_id     INT NOT NULL,
    from_date   DATE DEFAULT NULL,
    to_date     DATE DEFAULT NULL
);


