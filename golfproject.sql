DROP TABLE IF EXISTS scores;

CREATE TABLE scores
(
	player_id SERIAL PRIMARY KEY,
	golfer_name VARCHAR(100) NOT NULL,
	golf_course VARCHAR(100) NOT NULL,
	score INTEGER NOT NULL,
	handicap INTEGER NOT NULL,
	score_date TIMESTAMP DEFAULT NOW()
);

INSERT INTO SCORES(golfer_name, golf_course, score, handicap) VALUES ('Brian Siebert', 'St Denis', 81, 9);
INSERT INTO SCORES(golfer_name, golf_course, score, handicap) VALUES ('Mike Homolak', 'Manakiki', 82, 10);
INSERT INTO SCORES(golfer_name, golf_course, score, handicap) VALUES ('Tom Ross', 'Chardon Lakes', 90, 18);