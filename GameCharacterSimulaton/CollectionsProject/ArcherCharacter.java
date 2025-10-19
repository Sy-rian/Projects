package projects.collections.csc205;

public class ArcherCharacter extends GameCharacter {

	public ArcherCharacter() {
		super();
		this.name = "Jarkonisme";
		this.strength = 1;
		this.classOfCharacter = "Archer";

	}
	
	
	public int attack(int shoot) {
		int shootAttack = 0;

		strength = shoot + shootAttack;
		
		shoot = strength;
		
		System.out.println(name + " shoots and deals " + shoot + " damage.");

		
		return shoot;
	}
	
	public void miss() {
		System.out.println(name + " shoots and misses!");
	}
	
	public void dodge() {
		System.out.println(name + " sidesteps the attack!");

	}
	
}
