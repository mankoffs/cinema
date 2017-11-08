CREATE TABLE movie (
  movie_id        INT UNSIGNED NOT NULL AUTO_INCREMENT COMMENT 'Id of movies',
  title           VARCHAR(255)                         COMMENT 'Movies title',
  movie_rating_id INT UNSIGNED NOT NULL                COMMENT 'Id of movie rating',
  release_year    YEAR                                 COMMENT 'Release year',
  language_id     TINYINT UNSIGNED NOT NULL            COMMENT 'Movie language id',

  INDEX idx_title (title ASC),
  INDEX idx_fk_language_id (language_id ASC),

  PRIMARY KEY (movie_id),
  FOREIGN KEY (movie_rating_id) REFERENCES movie_rating(movie_rating_id)
    ON DELETE RESTRICT
    ON UPDATE CASCADE,
  FOREIGN KEY (language_id) REFERENCES movie_lang(language_id)
    ON DELETE RESTRICT
    ON UPDATE CASCADE)

  ENGINE = INNODB DEFAULT CHARSET = utf8 COMMENT = 'Movies';