package projects.collections.csc205;

import java.util.Iterator;
import java.util.Random;

public class CollectionsProject {

	public static void main(String[] args) {
				
		//instantiate bags
		BagTeam<GameCharacter> bag1 = new BagTeam<GameCharacter>();
		BagTeam<GameCharacter> bag2 = new BagTeam<GameCharacter>();
		
		Random rand = new Random();
		
		
		
		//BagTeam 1, adding members
		bag1.addMember(new ArcherCharacter());
		bag1.addMember(new WielderCharacter());
		bag1.addMember(new Marksman());
		bag1.addMember(new BeastTamer());
		bag1.addMember(new Gladiator());
		
		//using Team reference variable
		Team team1 = bag1;
		
		//print team
		System.out.println("Team 1: " + team1);

		
		//spacer
		System.out.println();
		
		
		
		//BagTeam 2, adding members
		bag2.addMember(new JackOfAllTrades());
		bag2.addMember(new Summoner());
		bag2.addMember(new WarriorCharacter());
		bag2.addMember(new MagicCharacter());
		bag2.addMember(new Assassin());
		
		//using Team reference variable
		Team team2 = bag2;
		
		//print team
		System.out.println("Team 2: " + team2);

		
		//spacer
		System.out.println();
		System.out.println("==========");

		
		
		//Battle
		System.out.println("The battle: ");
		System.out.println();
		
		//instantiate iterator
		Iterator<GameCharacter> oneIterator = team1.iterator();
		Iterator<GameCharacter> twoIterator = team2.iterator();
		
		//grabbing GameCharacters from team1
		GameCharacter t1Char1 = oneIterator.next();
		GameCharacter t1Char2 = oneIterator.next();
		GameCharacter t1Char3 = oneIterator.next();
		GameCharacter t1Char4 = oneIterator.next();
		GameCharacter t1Char5 = oneIterator.next();
		
		//grabbing GameCharacters from team2
		GameCharacter t2Char1 = twoIterator.next();
		GameCharacter t2Char2 = twoIterator.next();
		GameCharacter t2Char3 = twoIterator.next();
		GameCharacter t2Char4 = twoIterator.next();		
		GameCharacter t2Char5 = twoIterator.next();

		
		//total health of teams
		int totalHealthOfTeam1 = 20*5;
		int totalHealthOfTeam2 = 20*5;
		
		//rounds---a loop is more efficient but I can't think of how to write it right now
		System.out.println("Round 1");
		System.out.println("----------");
		while(t2Char1.isAlive() == true) {
			int damageStrength = rand.nextInt(9)+1;
	
			if(damageStrength < 3) {
					t1Char1.attack(damageStrength);
					t2Char1.dodge();
				}else if(damageStrength > 3) {
					t1Char1.attack(damageStrength);
					t2Char1.takeDamage(damageStrength);
						}
			if(t2Char1.health == 0 || t2Char1.health < 0)	{
				System.out.println(t1Char1.name + " from Team 1 wins!");
				System.out.println();
				System.out.println("Team one health: " +totalHealthOfTeam1);
				System.out.println("Team two health: " + (totalHealthOfTeam2-20));
			}
				}
		
		System.out.println();
		
		System.out.println("Round 2");
		System.out.println("----------");
		while(t2Char2.isAlive() == true) {
			int damageStrength = rand.nextInt(9)+1;
	
			if(damageStrength < 3) {
					t1Char2.attack(damageStrength);
					t2Char2.dodge();
				}else if(damageStrength > 3) {
					t1Char2.attack(damageStrength);
					t2Char2.takeDamage(damageStrength);
						}
			if(t2Char2.health == 0 || t2Char2.health < 0)	{
				System.out.println(t1Char2.name + " from Team 1 wins!");
				System.out.println();
				System.out.println("Team one health: " +totalHealthOfTeam1);
				System.out.println("Team two health: " + (totalHealthOfTeam2-40));
			}
				}
		
		System.out.println();
		
		System.out.println("Round 3");
		System.out.println("----------");
		while(t2Char3.isAlive() == true) {
			int damageStrength = rand.nextInt(9)+1;
	
			if(damageStrength < 3) {
					t1Char3.attack(damageStrength);
					t2Char3.dodge();
				}else if(damageStrength > 3) {
					t1Char3.attack(damageStrength);
					t2Char3.takeDamage(damageStrength);
						}
			if(t2Char3.health == 0 || t2Char3.health < 0)	{
				System.out.println(t1Char3.name + " from Team 1 wins!");
				System.out.println();
				System.out.println("Team one health: " +totalHealthOfTeam1);
				System.out.println("Team two health: " + (totalHealthOfTeam2-60));
			}
				}
		
		System.out.println();
		
		System.out.println("Round 4");
		System.out.println("----------");
		while(t2Char4.isAlive() == true) {
			int damageStrength = rand.nextInt(9)+1;
	
			if(damageStrength < 3) {
					t1Char4.attack(damageStrength);
					t2Char4.dodge();
				}else if(damageStrength > 3) {
					t1Char4.attack(damageStrength);
					t2Char4.takeDamage(damageStrength);
						}
			if(t2Char4.health == 0 || t2Char4.health < 0)	{
				System.out.println(t1Char4.name + " from Team 1 wins!");
				System.out.println();
				System.out.println("Team one health: " +totalHealthOfTeam1);
				System.out.println("Team two health: " + (totalHealthOfTeam2-80));
			}
				}
		
		System.out.println();
		
		System.out.println("Round 5");
		System.out.println("----------");
		while(t2Char5.isAlive() == true) {
			int damageStrength = rand.nextInt(9)+1;
	
			if(damageStrength < 3) {
					t1Char5.attack(damageStrength);
					t2Char5.dodge();
				}else if(damageStrength > 3) {
					t1Char5.attack(damageStrength);
					t2Char5.takeDamage(damageStrength);
						}
			if(t2Char5.health == 0 || t2Char5.health < 0)	{
				System.out.println(t1Char5.name + " from Team 1 wins!");
				System.out.println();
				System.out.println("Team one health: " +totalHealthOfTeam1);
				System.out.println("Team two health: " + (totalHealthOfTeam2-100));
			}
				}
		
		System.out.println("Team one wins!");

		
		
	}

}

