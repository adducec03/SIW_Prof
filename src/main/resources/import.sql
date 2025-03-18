--Inserisco film
INSERT INTO movie (id, title, year, url_image) VALUES (nextval('movie_seq'), 'Inception', 2010, 'https://www.warnerbros.it/sites/default/files/1000178221_flat.jpg');
INSERT INTO movie (id, title, year, url_image) VALUES (nextval('movie_seq'), 'The Dark Knight', 2008, 'https://example.com/the_dark_knight.jpg');
INSERT INTO movie (id, title, year, url_image) VALUES (nextval('movie_seq'), 'Interstellar', 2014, 'https://example.com/interstellar.jpg');
INSERT INTO movie (id, title, year, url_image) VALUES (nextval('movie_seq'), 'Pulp Fiction', 1994, 'https://example.com/pulp_fiction.jpg');
INSERT INTO movie (id, title, year, url_image) VALUES (nextval('movie_seq'), 'The Matrix', 1999, 'https://example.com/the_matrix.jpg');
INSERT INTO movie (id, title, year, url_image) VALUES (nextval('movie_seq'), 'Fight Club', 1999, 'https://example.com/fight_club.jpg');
INSERT INTO movie (id, title, year, url_image) VALUES (nextval('movie_seq'), 'Forrest Gump', 1994, 'https://example.com/forrest_gump.jpg');
INSERT INTO movie (id, title, year, url_image) VALUES (nextval('movie_seq'), 'The Shawshank Redemption', 1994, 'https://example.com/the_shawshank_redemption.jpg');
INSERT INTO movie (id, title, year, url_image) VALUES (nextval('movie_seq'), 'The Godfather', 1972, 'https://example.com/the_godfather.jpg');
INSERT INTO movie (id, title, year, url_image) VALUES (nextval('movie_seq'), 'The Lord of the Rings: The Return of the King', 2003, 'https://example.com/the_lord_of_the_rings_the_return_of_the_king.jpg');

--Inserisco artisti
INSERT INTO artist (id, nome, cognome, nascita) VALUES (nextval('artist_seq'), 'Christopher', 'Nolan', '1970-07-30');
INSERT INTO artist (id, nome, cognome, nascita) VALUES (nextval('artist_seq'), 'Quentin', 'Tarantino', '1963-03-27');
INSERT INTO artist (id, nome, cognome, nascita) VALUES (nextval('artist_seq'), 'Lana', 'Wachowski', '1965-06-21');
INSERT INTO artist (id, nome, cognome, nascita) VALUES (nextval('artist_seq'), 'Lilly', 'Wachowski', '1967-12-29');
INSERT INTO artist (id, nome, cognome, nascita) VALUES (nextval('artist_seq'), 'David', 'Fincher', '1962-08-28');
INSERT INTO artist (id, nome, cognome, nascita) VALUES (nextval('artist_seq'), 'Robert', 'Zemeckis', '1952-05-14');
INSERT INTO artist (id, nome, cognome, nascita) VALUES (nextval('artist_seq'), 'Frank', 'Darabont', '1959-01-28');
INSERT INTO artist (id, nome, cognome, nascita) VALUES (nextval('artist_seq'), 'Francis Ford', 'Coppola', '1939-04-07');
INSERT INTO artist (id, nome, cognome, nascita) VALUES (nextval('artist_seq'), 'Peter', 'Jackson', '1961-10-31'); 