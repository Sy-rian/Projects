package polymorphism.characters;

public class WarriorCharacter extends GameCharacter {

	public WarriorCharacter() {
		super();
		this.name = "Le'holei";
		this.strength = 4;
		this.classOfCharacter = "Warrior";

	}
	
	public int attack(int strike) {
		int strikeAttack = 0;

		strength = strike + strikeAttack;
		
		strike = strength;
		
		System.out.println(name + " strikes and deals " + strike + " damage.");

		
		return strike;
	}

	public void miss() {
		System.out.println(name + " strikes and misses!");
	}
	
	public void dodge() {
		System.out.println(name + " avoids the attack!");

	}
}
