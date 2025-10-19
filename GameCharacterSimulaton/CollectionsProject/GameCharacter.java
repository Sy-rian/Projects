package projects.collections.csc205;

abstract public class GameCharacter {
	
	protected int strength = 0;
	protected int health = 20;
	protected String name = "";
	protected String classOfCharacter = "";
	
	
	//public int attack() returns the strength of an attack
	public int attack(int x) {
		
		return strength;
	}//works
	
	
	//public void takeDamage(int points) reduces the character’s health based on the strength of an attack
	public void takeDamage(int points) {
		strength = health - points;
		
		health = strength;
			
		if(health > 0) {
			System.out.println(name + " gets hit and their health is now at " + health);
		}else if(health == 0){
			System.out.println(name + " gets hit and their health is " + health);
		}else if(health < 0) {
			System.out.println(name + " gets hit and their health is drained!");
		}
			
		
	}//works
	
	
	
	public void dodge() {
		System.out.println(name + " dodges the attack!");

	}//works
	
	public void miss() {
		System.out.println(name + " misses!");

	}//works
		
	//public boolean isAlive() returns a Boolean based on whether or not the character’s health is greater than 0
	public boolean isAlive() {
		//System.out.print(name + " is alive: "); to use for a driver like my driver, but not the driver I turned in
		
		return health > 0;
	}//works
	
	/*public void addName(String charName) {
		name = charName;
	}*/
	
	
	//A toString() method that displays the name, class, strength, & health of the character
	public String toString() {
		return (name + " |" + "Class: " + classOfCharacter + "| " + "Strength: " + strength  + "|" + " Health: " + health  + "|");
	}//works
}
