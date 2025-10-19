package polymorphism.characters;

import java.util.Random;

public class BeastTamer extends GameCharacter {

	public BeastTamer() {
		super();
		this.name = "Alexis";
		this.strength = 4;
		this.classOfCharacter = "Beast Tamer";

	}
	
	
	public int attack(int lunge) {
		int lungeAttack = 0;
		

		strength = lunge + lungeAttack;
		lunge = strength;
		
		Random animal = new Random();
		int whatAnimal = animal.nextInt(3)+1;
		
		if(whatAnimal == 1) {
			System.out.println(name + "'s tiger pounces and deals " + lunge + " damage.");
		}else if(whatAnimal == 2) {
			System.out.println(name + "'s bear lunges and deals " + lunge + " damage.");
		}else if(whatAnimal == 3) {
			System.out.println(name + "'s black panter claws and deals " + lunge + " damage.");
		}
		//System.out.println(name + " summons a spirit and deals " + summon + " damage.");

		
		return lunge;
	}
	
	public void miss() {
		Random animal2 = new Random();
		int whatAnimal2 = animal2.nextInt(3)+1;

		
		
		if(whatAnimal2 == 1) {
			System.out.println(name + "'s tiger pounces and misses!");
		}else if(whatAnimal2 == 2) {
			System.out.println(name + "'s bear lunges and misses!");
		}else if(whatAnimal2 == 3) {
			System.out.println(name + "'s black panter claws and misses!");
		}
	}
	
	public void dodge() {
		System.out.println("One of " + name + "'s beasts blocks the attack!");

	}
	
}