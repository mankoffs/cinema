CREATE TABLE IF NOT EXISTS movie_lang (
  language_id TINYINT UNSIGNED NOT NULL AUTO_INCREMENT,
  name CHAR(20) NOT NULL,
  PRIMARY KEY (language_id))

  ENGINE = InnoDB DEFAULT CHARACTER SET = utf8