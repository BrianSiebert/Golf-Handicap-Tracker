package com.techelevator.model;

import java.time.LocalDateTime;

public class ScoreResult {
	private String name;
	private int score;
	private int handicap;
	private LocalDateTime dateSubmitted;
	private String golfCourse;
	public Long setId;
		
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getHandicap() {
		return handicap;
	}

	public void setHandicap(int handicap) {
		this.handicap = handicap;
	}

	public LocalDateTime getDateSubmitted() {
		return dateSubmitted;
	}

	public void setDateSubmitted(LocalDateTime dateSubmitted) {
		this.dateSubmitted = dateSubmitted;
	}

	public String getGolfCourse() {
		return golfCourse;
	}

	public void setGolfCourse(String golfCourse) {
		this.golfCourse = golfCourse;
	}

	public Long getSetId() {
		return setId;
	}

	public void setId(Long setId) {
		this.setId = setId;
	}



}
