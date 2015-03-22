package org.example.learn;

import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Enemy enemy = new Enemy(10, 3);
			System.out.println("Hitpoints: " + enemy.getHitPoints() + " Lives: " + enemy.getLives());
			Soldier soldier = new Soldier(25, 1);
			System.out.println("Hitpoints: " + soldier.getHitPoints() + " Lives: " + soldier.getLives());
			
			SuperSoldier superSoldier = new SuperSoldier(25, 1);
			
			superSoldier.takeDamage(8);
			
			enemy.takeDamage(8);
			
			
						
		}
		
	}


