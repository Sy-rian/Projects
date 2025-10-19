package projects.collections.csc205;

import java.util.Random;

public class Summoner extends GameCharacter {

	public Summoner() {
		super();
		this.name = "Autumn";
		this.strength = 3;
		this.classOfCharacter = "Summoner";

	}
	
	
	public int attack(int summon) {
		int summonAttack = 0;
		Random summoned = new Random();
		int whatsSummoned = summoned.nextInt(3)+1;

		strength = summon + summonAttack;
		
		summon = strength;
		
		if(whatsSummoned == 1) {
			System.out.println(name + " summons a ghost and deals " + summon + " damage.");
		}else if(whatsSummoned == 2) {
			System.out.println(name + " summons a poltergeist and deals " + summon + " damage.");
		}else if(whatsSummoned == 3) {
			System.out.println(name + " summons a demon and and deals " + summon + " damage.");
		}
		//System.out.println(name + " summons a spirit and deals " + summon + " damage.");

		
		return summon;
	}
	
	public void miss() {
		Random summoned2 = new Random();
		int whatsSummoned2 = summoned2.nextInt(3)+1;

		
		
		if(whatsSummoned2 == 1) {
			System.out.println(name + " summons a ghost and misses!");
		}else if(whatsSummoned2 == 2) {
			System.out.println(name + " summons a poltergeist and misses!");
		}else if(whatsSummoned2 == 3) {
			System.out.println(name + " summons a demon and misses!");
		}
	}
	
	public void dodge() {
		System.out.println(name + " uses a spirit to block the attack!");

	}
	
}