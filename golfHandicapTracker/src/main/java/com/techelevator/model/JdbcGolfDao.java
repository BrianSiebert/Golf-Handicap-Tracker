package com.techelevator.model;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

@Component
public class JdbcGolfDao implements ScoreResultDao{

	
	private JdbcTemplate jdbcTemplate;

	@Autowired
	public JdbcGolfDao(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public void saveNewScore(ScoreResult scoreToSave) {
		String sqlSaveScore = "INSERT INTO scores (golfer_name, golf_course, score, handicap) VALUES(?,?,?,?)";
		jdbcTemplate.update(sqlSaveScore,
							scoreToSave.getName(),
							scoreToSave.getGolfCourse(),
							scoreToSave.getScore(),
							scoreToSave.getHandicap());
	
	}
	
	@Override
	public List<ScoreResult> getAllScores() {
		List<ScoreResult> scores = new ArrayList<>();
		String sqlSelectAllScores = "SELECT * FROM scores";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlSelectAllScores);
		
		while(results.next()) {
			scores.add(mapRowToScores(results));
		}
		return scores;
	}

	private ScoreResult mapRowToScores(SqlRowSet results) {
		ScoreResult score = new ScoreResult();
		score.setName(results.getString("golfer_name"));
		score.setScore(results.getInt("score"));
		score.setGolfCourse(results.getString("golf_course"));
		score.setId(results.getLong("player_id"));
		score.setHandicap(results.getInt("handicap"));
		return score;
		
	}

}

