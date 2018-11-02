package com.springframework;

public class Student {
	
	private int id;
	private Scores scores;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Scores getScores() {
		return scores;
	}

	public void setScores(Scores scores) {
		this.scores = scores;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", scores=" + scores + "]";
	}		
}
