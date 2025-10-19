package polymorphism.characters;

public class Assassin extends GameCharacter {

	public Assassin() {
		super();
		this.name = "Bai'li";
		this.strength = 3;
		this.classOfCharacter = "Assassin";

	}
	
	public int attack(int sneak) {
		int sneakAttack = 0;

		strength = sneak + sneakAttack;
		
		sneak = strength;
		
		System.out.println(name + " stabs and deals " + sneak + " damage.");

		
		return sneak;
	}

	public void miss() {
		System.out.println(name + " throws a knife and misses!");
	}
	
	public void dodge() {
		System.out.println(name + " disappears before the attack!");

	}
}
