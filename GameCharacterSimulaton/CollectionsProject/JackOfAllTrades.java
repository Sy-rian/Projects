package projects.collections.csc205;

import java.util.Random;

public class JackOfAllTrades extends GameCharacter {

	public JackOfAllTrades() {
		super();
		this.name = "Brendon";
		this.strength = 5;
		this.classOfCharacter = "Jack-of-All-Trades";

	}
	
	
	public int attack(int wildCard) {
		int wildCardAttack = 0;
		

		strength = wildCard + wildCardAttack;
		wildCard = strength;
		
		Random random = new Random();
		int randomAttack = random.nextInt(4)+1;
		
		if(randomAttack == 1) {
			System.out.println(name + " uses a spear and deals " + wildCard + " damage.");
		}else if(randomAttack == 2) {
			System.out.println(name + " summons a spirit and deals " + wildCard + " damage.");
		}else if(randomAttack == 3) {
			System.out.println(name + " casts a spell and deals " + wildCard + " damage.");
		}else if(randomAttack == 4) {
			System.out.println(name + "'s jaguar claws and deals " + wildCard + " damage.");
		}

		
		return wildCard;
	}
	
	
	public void miss() {
		Random random2 = new Random();
		int randomAttack2 = random2.nextInt(3)+1;

		
		
		if(randomAttack2 == 1) {
			System.out.println(name + " swings a sword and misses!");
		}else if(randomAttack2 == 2) {
			System.out.println(name + " strikes and misses!");
		}else if(randomAttack2 == 3) {
			System.out.println(name + " shoots and misses!");
		}else if(randomAttack2 == 4) {
			System.out.println(name + " throws a knife and misses!");
		}

	}
	
	public void dodge() {
		System.out.println(name + " runs past the attack!");

	}
	
}