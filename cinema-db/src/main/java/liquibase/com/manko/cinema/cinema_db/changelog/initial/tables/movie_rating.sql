CREATE TABLE IF NOT EXISTS movie_rating (
  movie_rating_id          INT          UNSIGNED NOT NULL AUTO_INCREMENT COMMENT 'Id of movie rating',
  movie_rating_symbol      VARCHAR(10)  NOT NULL  COMMENT 'Symbol of movie rating',
  movie_rating_description VARCHAR(255) COMMENT 'description of movie rating',
  PRIMARY KEY (movie_rating_id)
)
  ENGINE = INNODB
  DEFAULT CHARSET = utf8
  COMMENT = 'Movie rating';