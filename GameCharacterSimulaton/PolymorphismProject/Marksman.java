package polymorphism.characters;

public class Marksman extends GameCharacter {

	public Marksman() {
		super();
		this.name = "Daylor";
		this.strength = 2;
		this.classOfCharacter = "Marksman";

	}
	
	public int attack(int fire) {
		int fireAttack = 0;

		strength = fire + fireAttack;
		
		fire = strength;
		
		System.out.println(name + " shoots and deals " + fire + " damage.");

		
		return fire;
	}

	public void miss() {
		System.out.println(name + " fires and misses!");
	}
	
	public void dodge() {
		System.out.println(name + " ducks under the attack!");

	}
}
