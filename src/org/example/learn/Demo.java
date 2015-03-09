package org.example.learn;

import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Player tim = new Player("Timothy", 7);
				
		System.out.println(tim.getHandleName());
		System.out.println(tim.getWeapon().getName());
		
		Weapon myAxe = new Weapon("GoldShine Axe", 15, 50);
		tim.setWeapon(myAxe);
		
		System.out.println(tim.getWeapon().getName());
		InventoryItem redPotion = new InventoryItem(ItemType.POTION, "Red Potion");
		tim.addInventoryItem(redPotion);
		
		tim.addInventoryItem(new InventoryItem(ItemType.ARMOR, "+3 Chest Amor"));
		
		boolean wasDeleted = tim.dropInventoyrItem(redPotion);
		System.out.println(wasDeleted);
		
		ArrayList<InventoryItem> allItems = tim.getInventoryitems();
		
		for (InventoryItem item : allItems) {
			System.out.println(item.getName());
			
		}
		
	}

}
