package org.example.learn;

public class Enemy {
	
	private int hitPoints;
	private int lives;
	
	public Enemy(int hitPoints, int lives) {
		this.hitPoints = hitPoints;
		this.lives = lives;
	}

	//   GETTERS AND SETTERS
	
	public int getHitPoints() {
		return hitPoints;
	}

	public void setHitPoints(int hitPoints) {
		this.hitPoints = hitPoints;
	}

	public int getLives() {
		return lives;
	}

	public void setLives(int lives) {
		this.lives = lives;
	}
	
	//  METHODS
	
	public void takeDamage(int damage) {
		int remainingHitPoints = getHitPoints() - damage;
		setHitPoints(remainingHitPoints);
		System.out.println("I took " + damage + " points damage, and have " + remainingHitPoints + " points left.");
	}
	
	

}
