package polymorphism.characters;

public class WielderCharacter extends GameCharacter {

	public WielderCharacter() {
		super();
		this.name = "Hei'li";
		this.strength = 3;
		this.classOfCharacter = "Wielder";

	}

	public int attack(int swing) {
		int swingAttack = 0;

		strength = swing + swingAttack;
		
		swing = strength;
		
		System.out.println(name + " swings and deals " + swing + " damage.");

		
		return swing;
	}
	
	public void miss() {
		System.out.println(name + " swings and misses!");
	}
	
	public void dodge() {
		System.out.println(name + " evades the attack!");

	}
}
