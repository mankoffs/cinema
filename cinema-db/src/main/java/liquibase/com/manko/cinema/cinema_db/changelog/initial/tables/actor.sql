CREATE TABLE IF NOT EXISTS actor (
  actor_id   INT UNSIGNED NOT NULL AUTO_INCREMENT COMMENT 'Id of actor',
  first_name VARCHAR(50)  NOT NULL                COMMENT 'first name of actor',
  last_name  VARCHAR(50)                          COMMENT 'last name of actor',
  PRIMARY KEY (actor_id),
  INDEX idx_actor_last_name (last_name ASC)
)
  ENGINE = INNODB
  DEFAULT CHARSET = utf8
  COMMENT = 'Actors name';