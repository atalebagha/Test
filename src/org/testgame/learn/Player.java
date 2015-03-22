package org.testgame.learn;

import java.util.ArrayList;

public class Player {
	
	String name;
	int points;
	int health;
	int level;
	Weapon weapon;
	Armor armor;
	
	
	//////////////////////////////////////
	//    Constructor                   //
	//////////////////////////////////////
	
	public Player() {
		super();
		name = "unkown";
		points = 0;
		health = 100;
		level = 1;
		
	}
	
	public Player(String name, int points, int health, int level) {
		super();
		this.name = name;
		this.points = points;
		this.health = health;
		this.level = level;
	}
	
	//////////////////////////////////////
	//    Getters and Setters           //
	//////////////////////////////////////
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getPoints() {
		return points;
	}


	public void setPoints(int points) {
		this.points = points;
	}


	public int getHealth() {
		return health;
	}


	public void setHealth(int health) {
		this.health = health;
	}


	public int getLevel() {
		return level;
	}


	public void setLevel(int level) {
		this.level = level;
	}
	
	// External Class Getters and Setters
	
	public Weapon getWeapon() {
		return this.weapon;
	}
	
	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}
	
	public Armor getArmor() {
		return this.armor;
	}
	
	public void setArmor(Armor armor)  {
		this.armor = armor;
	}
	
	
}
