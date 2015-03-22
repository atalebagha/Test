package org.testgame.learn;


public class Weapon {
	
	private String name;
	private int power;
	
	
	//////////////////////////////////////
	//         Constructor              //
	//////////////////////////////////////
	
	public Weapon() {
		super();
	}
	
	public Weapon(String name, int power) {
		super();
		this.name = name;
		this.power = power;
	}
	
	//////////////////////////////////////
	//         Getters/Setters          //
	//////////////////////////////////////
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	
	
	
}
