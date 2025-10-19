package projects.collections.csc205;
import java.util.Random;

public class GameCharacterDriver {
	
	public static void main(String[] args) {

	ArcherCharacter Bard = new ArcherCharacter();
	MagicCharacter Cleric = new MagicCharacter();
	WarriorCharacter Barbarian = new WarriorCharacter();
	WielderCharacter Fighter = new WielderCharacter();
	Summoner SpirtMancer = new Summoner();
	BeastTamer BeastLord = new BeastTamer();
	JackOfAllTrades MegaWielder = new JackOfAllTrades();
	Marksman SharpShooter = new Marksman();
	Assassin Shadow = new Assassin();
	Gladiator HardHitter = new Gladiator();
	
	Random rand = new Random();
	
	
	
	int damageStrength = rand.nextInt(11)+1;

	
	//Bard
	System.out.println(Bard.toString());
	Bard.attack(damageStrength);
	Bard.takeDamage(damageStrength);
	Bard.dodge();
	Bard.miss();
	System.out.println(Bard.isAlive());
	System.out.println();

	
	


	//Summoner
	System.out.println(SpirtMancer.toString());
	SpirtMancer.attack(damageStrength);
	SpirtMancer.attack(damageStrength);
	SpirtMancer.attack(damageStrength);
	SpirtMancer.takeDamage(damageStrength);
	SpirtMancer.dodge();
	SpirtMancer.miss();
	SpirtMancer.miss();
	SpirtMancer.miss();
	System.out.println(SpirtMancer.isAlive());
	System.out.println();

	
	


	//BeastTamer
	System.out.println(BeastLord.toString());
	BeastLord.attack(damageStrength);
	BeastLord.attack(damageStrength);
	BeastLord.attack(damageStrength);
	BeastLord.takeDamage(damageStrength);
	BeastLord.dodge();
	BeastLord.miss();
	BeastLord.miss();
	BeastLord.miss();
	System.out.println(BeastLord.isAlive());
	System.out.println();

	
	


	//JackOfAllTrades
	System.out.println(MegaWielder.toString());
	MegaWielder.attack(damageStrength);
	MegaWielder.attack(damageStrength);
	MegaWielder.attack(damageStrength);
	MegaWielder.attack(damageStrength);
	MegaWielder.takeDamage(damageStrength);
	MegaWielder.dodge();
	MegaWielder.miss();
	MegaWielder.miss();
	MegaWielder.miss();
	MegaWielder.miss();
	System.out.println(MegaWielder.isAlive());
	System.out.println();

	
	


	//Marksman
	System.out.println(SharpShooter.toString());
	SharpShooter.attack(damageStrength);
	SharpShooter.takeDamage(damageStrength);
	SharpShooter.dodge();
	SharpShooter.miss();
	System.out.println(SharpShooter.isAlive());
	System.out.println();

	
	


	//Assassin
	System.out.println(Shadow.toString());
	Shadow.attack(damageStrength);
	Shadow.takeDamage(damageStrength);
	Shadow.dodge();
	Shadow.miss();
	System.out.println(Shadow.isAlive());
	System.out.println();

	
	


	//Gladiator
	System.out.println(HardHitter.toString());
	HardHitter.attack(damageStrength);
	HardHitter.takeDamage(damageStrength);
	HardHitter.dodge();
	HardHitter.miss();
	System.out.println(HardHitter.isAlive());
	System.out.println();

	
	


	//Cleric
	System.out.println(Cleric.toString());
	Cleric.attack(damageStrength);
	Cleric.takeDamage(damageStrength);
	Cleric.dodge();
	Cleric.miss();
	System.out.println(Cleric.isAlive());
	System.out.println();

	
	


	//Barbarian
	System.out.println(Barbarian.toString());
	Barbarian.attack(damageStrength);
	Barbarian.takeDamage(damageStrength);
	Barbarian.dodge();
	Barbarian.miss();
	System.out.println(Barbarian.isAlive());
	System.out.println();




	//Fighter
	System.out.println(Fighter.toString());
	Fighter.attack(damageStrength);
	Fighter.takeDamage(damageStrength);
	Fighter.dodge();
	Fighter.miss();
	System.out.println(Fighter.isAlive());
	System.out.println();

	

	/*
	 * if(randomCharacter == new WielderCharacter()) {
			WielderCharacter Fighter = new WielderCharacter();
			Fighter.attack(4);
		}else if(randomCharacter == new WarriorCharacter()) {
			WarriorCharacter Barbarian = new WarriorCharacter();
			Barbarian.attack(4);
		}else if(randomCharacter == new MagicCharacter()) {
			MagicCharacter Cleric = new MagicCharacter();
			Cleric.attack(4);
		}else if(randomCharacter == new ArcherCharacter()) {
			ArcherCharacter Bard = new ArcherCharacter();
			Bard.attack(4);
		}
	 */
	
	/*	ArcherCharacter Bard = new ArcherCharacter();
	MagicCharacter Cleric = new MagicCharacter();
	Random rounds = new Random();
	int count = 0;
	
	//Cleric stats
	System.out.println(Cleric.toString());
	
	//Bard stats
	System.out.println(Bard.toString());

	
	
/*	//a for loop that runs until one of the character's health gets to 0
	int LIVES = 0;
	for(int life = 0; life < LIVES; life++) {
		
	}*/
	
	
	//try something with this for loop
	/*for(int i = 0; i < rounds.nextInt(3); i++) {
	if(Bard.health > 0) {
		count++;
	}else
		System.out.println("Blank wins!");
}*/
	
	/*	//Fight simulation
	Cleric.attack(4);
	Bard.takeDamage(4);
	System.out.println();
	
	Bard.attack(2);
	Cleric.takeDamage(2);
	System.out.println();


	Cleric.attack(8);
	Bard.takeDamage(8);
	System.out.println();
	
	Bard.attack(4);
	Cleric.takeDamage(4);
	System.out.println();

	
	Cleric.attack(3);
	Bard.takeDamage(3);
	System.out.println();


	Cleric.attack(5);
	Bard.takeDamage(5);
	System.out.println(Bard.isAlive());
	System.out.println();
	
	System.out.println(Cleric.name + " wins!");*/
	
	/*
	 * while(RANDOMCHARACTER2.HEALTH is above 0 and not 0){
	 * 		//Once RANDOMCHARACTER2.HEALTH hits 0 or goes below 0 (because RANDOMCHARACTER2.HEALTH won't always hit a perfect 0), the loop stops and prints (RANDOMCHARACTER.NAME + " wins!")
	 * 	
	 * 		//while the loop runs, the DAMAGESTRENGTH is supposed to randomize and cause RANDOMCHARACTER2 to either dodge to take damage until HEALTH hits 0 or goes below 0
	 * 	if(DAMAGESTRENGTH < 3){
	 * 		RANDOMCHARACTER.attack() is set to DAMAGESTRENGTH to fit the parameters
	 * 		RANDOMCHARACTER.DODGE() is used for when an attack strength is less than 3
	 * 	}else if(DAMAGESTRENGTH > 3){
	 * 		RANDOMCHARACTER.attack() is set to DAMAGESTRENGTH to fit the parameters
	 * 		RANDOMCHARACTER2.takeDamage() is used for when an attack strength is above 3
	 * 	}
	 * if(RANDOMCHARACTER2.HEALTH == 0 || RANDOMCHARACTER2.HEALTH < 0)	{
	 * 		system.out.println(randomCharacter.name + " wins!)
	 * 	}
	 * }
	 */
	
	
	//testing
	//int damageStrength = rand.nextInt(9)+1;
/*	int health = randomCharacter2.health;

	while(health > 0){
		for(int rounds = 0; rounds < health; rounds++){
			int damageStrength = rand.nextInt(5)+1;
			
			if(damageStrength < 3) {
				randomCharacter.attack(damageStrength);
				randomCharacter2.dodge();
				System.out.println();
				
			}else if(damageStrength > 3) {
				randomCharacter.attack(damageStrength);
				randomCharacter2.takeDamage(damageStrength);
				System.out.println();
			}
		}
		health++;
	}*/
	
	/*if(damageStrength < 3) {
		randomCharacter.attack(damageStrength);
		randomCharacter2.dodge();
		System.out.println();
	}else if(damageStrength > 3) {
		randomCharacter.attack(damageStrength);
		randomCharacter2.takeDamage(damageStrength);
		System.out.println();
	
	}*/
	
	//test for loop - the health doesn't always hit 0 and even goes into the negatives, but executes the if and if else parts based on if damageStrength is less or more than 3
	/*int health = randomCharacter2.health;

	for(int rounds = 0; rounds < (health - 1); rounds++){
		int damageStrength = rand.nextInt(9)+1;
		
		if(damageStrength < 3) {
			randomCharacter.attack(damageStrength);
			randomCharacter2.dodge();
			System.out.println();
		}else if(damageStrength > 3) {
			randomCharacter.attack(damageStrength);
			randomCharacter2.takeDamage(damageStrength);
			System.out.println();
		}
		else if(health < 0) {
			System.out.println(randomCharacter.name + " wins!");
	}
}
	
	
	
	/*For while and do-while
	int damageStrength = rand.nextInt(5)+1;

	//test while loop - gets stuck in a loop if damageStrength < 3, or continues until randomCharacter2.health = 0 (but only outputs the else if part of the statement)
		while(randomCharacter2.health != 0) {
			if(damageStrength < 3) {
				randomCharacter.attack(damageStrength);
				randomCharacter2.dodge();
				System.out.println();
			}else if(damageStrength > 3) {
				randomCharacter.attack(damageStrength);
				randomCharacter2.takeDamage(damageStrength);
				System.out.println();
			}
		}
		
		System.out.println(randomCharacter.name + " wins!");
	
	
	
		//test do-while loop - gets stuck in a loop if damageStrength < 3, or continues until randomCharacter2.health = 0 (but only outputs the else if part of the statement)
		do {
			if(damageStrength < 3) {
				randomCharacter.attack(damageStrength);
				randomCharacter2.dodge();
				System.out.println();
			}else if(damageStrength > 3) {
				randomCharacter.attack(damageStrength);
				randomCharacter2.takeDamage(damageStrength);
				System.out.println();
			}
		
		}while(randomCharacter2.health != 0);*/


	}
}
