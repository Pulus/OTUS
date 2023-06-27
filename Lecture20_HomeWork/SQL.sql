CREATE TABLE Questions (
	qurstion_id		SERIAL		PRIMARY KEY,
	text			TEXT		NOT NULL UNIQUE
);

CREATE TABLE Answers (
	answer_id		SERIAL		PRIMARY KEY,
	qurstion_id		INTEGER		REFERENCES Questions(qurstion_id),
	text			TEXT		NOT NULL,
	corr_variant	BOOLEAN
);

INSERT INTO Questions(text)
VALUES
    ('2+2='),
    ('2+4='),
	('2+9=');
	
INSERT INTO Answers(qurstion_id, text, corr_variant)
VALUES
    (1, '1',FALSE),
    (1, '2',FALSE),
	(1, '3',FALSE),
	(1, '4',TRUE),
	
	(2, '1',FALSE),
	(2, '2',FALSE),
	(2, '3',FALSE),
	(2, '4',FALSE),
	(2, '6',TRUE),
	
	(3, '11',TRUE),
	(3, '12',FALSE),
	(3, '13',FALSE);
	
SELECT * FROM Questions;	
SELECT * FROM Answers;

SELECT q.text AS Question, a.text AS "Сorrect variant"
FROM Questions q
JOIN Answers a ON a.qurstion_id = q.qurstion_id
WHERE a.corr_variant = TRUE;
