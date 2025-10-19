package projects.collections.csc205;

public class Gladiator extends GameCharacter {

	public Gladiator() {
		super();
		this.name = "Onasettie";
		this.strength = 4;
		this.classOfCharacter = "Gladiator";

	}
	
	public int attack(int hit) {
		int hitAttack = 0;

		strength = hit + hitAttack;
		
		hit = strength;
		
		System.out.println(name + " hits and deals " + hit + " damage.");

		
		return hit;
	}

	public void miss() {
		System.out.println(name + " swings their fist and misses!");
	}
	
	public void dodge() {
		System.out.println(name + " jumps out of the way of the attack!");

	}
}
