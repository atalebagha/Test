package org.example.learn;
import java.util.ArrayList;

public class Player {
	private String handleName;
	private int lives;
	private int level;
	private int score;
	private Weapon weapon;
	private ArrayList<InventoryItem> inventoryitems;
	
	public Player() {
		this.handleName = "Unknown Player";
		this.lives = 3;
		this.level = 1;
		this.score = 0;
		setDefaultWeapon();
		inventoryitems = new ArrayList<InventoryItem>();
	}

	public Player(String name) {
		this();
		setHandleName(name);

	}
	
	public Player(String handle, int level) {
		this();
		setHandleName(handle);
		setLevel(level);
	}
		
	public Weapon getWeapon() {
		return weapon;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}

	private void setDefaultWeapon() {
			this.weapon = new Weapon("Sword", 10, 20);
	}

	public String getHandleName() {
		return handleName;
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

	public ArrayList<InventoryItem> getInventoryitems() {
		return inventoryitems;
	}

	//public void setInventoryitems(ArrayList<InventoryItem> inventoryitems) {
	//	this.inventoryitems = inventoryitems;
	//}
	
	public void addInventoryItem(InventoryItem inventoryItem) {
		inventoryitems.add(inventoryItem);
	}
	
	public boolean dropInventoyrItem(InventoryItem inventoryItem)  {
		if(this.inventoryitems.contains(inventoryItem)){
			inventoryitems.remove(inventoryItem);
			return true;}
		return false;
		
	}
	
	
}
