package com.techelevator.model;

import java.util.List;

public interface ScoreResultDao {

	public List<ScoreResult> getAllScores();
	
	public void saveNewScore(ScoreResult scoreToSave);
	
	
}


