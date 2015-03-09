package org.example.learn;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Player tim = new Player("Timothy", 7);
				
		System.out.println(tim.getHandleName());
		System.out.println(tim.getWeapon().getName());
		
		Weapon myAxe = new Weapon("GoldShine Axe", 15, 50);
		tim.setWeapon(myAxe);
		
		System.out.println(tim.getWeapon().getName());
		
	}

}
