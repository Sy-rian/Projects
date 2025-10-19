package polymorphism.characters;

public class MagicCharacter extends GameCharacter {

	public MagicCharacter() {
		super();
		this.name = "Desdremar";
		this.strength = 3;
		this.classOfCharacter = "Magic";
	}
	
	public int attack(int cast) {
		int castAttack = 0;

		strength = cast + castAttack;
		
		cast = strength;
		
		System.out.println(name + " casts a spell and deals " + cast + " damage.");

		
		return cast;
	}

	public void miss() {
		System.out.println(name + " casts a spell and misses!");
	}
	
	public void dodge() {
		System.out.println(name + " floats over the attack!");

	}

}
