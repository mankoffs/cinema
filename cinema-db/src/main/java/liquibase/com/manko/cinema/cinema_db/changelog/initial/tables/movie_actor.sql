CREATE TABLE IF NOT EXISTS movie_actor (
  actor_id INT UNSIGNED NOT NULL COMMENT 'Id of actor',
  movie_id INT UNSIGNED NOT NULL COMMENT 'Id of movie',

  PRIMARY KEY (actor_id, movie_id),
  CONSTRAINT fk_cinema_actor_actor FOREIGN KEY (actor_id) REFERENCES actor(actor_id)
    ON DELETE RESTRICT
    ON UPDATE CASCADE,
  CONSTRAINT fk_cinema_actor_cinema FOREIGN KEY (movie_id) REFERENCES movie(movie_id)
    ON DELETE RESTRICT
    ON UPDATE CASCADE
)
  ENGINE = INNODB
  DEFAULT CHARSET = utf8
  COMMENT = 'Movie actors';