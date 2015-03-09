package org.testgame.learn;

public class Weapon {
	
	String playerName;
	int points;
	int defeats;
	int kills;
	int victories;
	int strength;
	int gold;
	int silver;
	int wood;
	int livestock;
	int level;
	int tribe;
	String country;
	
	
	
	public Weapon() {
		super();
	}

	public Weapon(String playerName, int points, int defeats, int kills,
			int victories, int strength, int gold, int silver, int wood,
			int livestock, int level, int tribe, String country) {
		super();
		this.playerName = playerName;
		this.points = points;
		this.defeats = defeats;
		this.kills = kills;
		this.victories = victories;
		this.strength = strength;
		this.gold = gold;
		this.silver = silver;
		this.wood = wood;
		this.livestock = livestock;
		this.level = level;
		this.tribe = tribe;
		this.country = country;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	public int getDefeats() {
		return defeats;
	}

	public void setDefeats(int defeats) {
		this.defeats = defeats;
	}

	public int getKills() {
		return kills;
	}

	public void setKills(int kills) {
		this.kills = kills;
	}

	public int getVictories() {
		return victories;
	}

	public void setVictories(int victories) {
		this.victories = victories;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getGold() {
		return gold;
	}

	public void setGold(int gold) {
		this.gold = gold;
	}

	public int getSilver() {
		return silver;
	}

	public void setSilver(int silver) {
		this.silver = silver;
	}

	public int getWood() {
		return wood;
	}

	public void setWood(int wood) {
		this.wood = wood;
	}

	public int getLivestock() {
		return livestock;
	}

	public void setLivestock(int livestock) {
		this.livestock = livestock;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getTribe() {
		return tribe;
	}

	public void setTribe(int tribe) {
		this.tribe = tribe;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	
	
	

}
