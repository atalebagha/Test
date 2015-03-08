package org.example.learn;

public class Player {
	private String handleName;
	private int lives;
	private int level;
	private int score;
	
	public Player() {
		handleName = "Unknown Player";
	}

	public Player(String handleName) {
		setHandleName(this.handleName);
		lives = 3;
		level = 1;
		score = 0;
	}
	public String getHandleName() {
		return handleName;
	}
	
	public void setNameAndLevel(String handleName, int level) {
		setHandleName(handleName);
		setLevel(level);
	}
	
	public void setHandleName(String handleName) {
		if(handleName.length() < 4)
				return;
		
		this.handleName = handleName;
	}

	public int getLives() {
		return lives;
	}

	public void setLives(int lives) {
		this.lives = lives;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	
}
