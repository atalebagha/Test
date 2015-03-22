package org.testgame.learn;

public class Armor {
	
	private String name;
	private int strength;
	private String type;
	
	//////////////////////////////////////
	//         Constructor              //
	//////////////////////////////////////

	
	public Armor() {
		super();
	}
	
	public Armor(String name, int strength, String type) {
		super();
		this.name = name;
		this.strength = strength;
		this.type = type;
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

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	
	
	

}
