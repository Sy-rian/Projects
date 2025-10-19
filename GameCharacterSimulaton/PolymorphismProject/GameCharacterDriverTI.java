package polymorphism.characters;
import java.util.Random;

public class GameCharacterDriverTI {

	public static void main(String[] args) {
		
		
		Random rand = new Random();
		
		GameCharacter[] character = { new WielderCharacter(), new WarriorCharacter(), 
				new MagicCharacter(), new ArcherCharacter(), new Gladiator(), new Marksman(), 
				new BeastTamer(), new Assassin(), new JackOfAllTrades(), new Summoner()};
			

		int genCharacter = rand.nextInt(character.length);
		GameCharacter randomCharacter = character[genCharacter];
		
		int genCharacter2 = rand.nextInt(character.length);
		GameCharacter randomCharacter2 = character[genCharacter2];
		
		/*int genCharacter3 = rand.nextInt(character.length);
		GameCharacter randomCharacter3 = character[genCharacter3];
		
		int genCharacter4 = rand.nextInt(character.length);
		GameCharacter randomCharacter4 = character[genCharacter4];
		*/
			

			while(randomCharacter2.isAlive() == true) {
				int damageStrength = rand.nextInt(9)+1;
				int damageStrength2 = rand.nextInt(9)+1;
				
					if(damageStrength < 3 && damageStrength2 < 3) {
						randomCharacter.attack(damageStrength);
						randomCharacter2.dodge();
						System.out.println();
						
						//randomCharacter3.attack(damageStrength2);
						//randomCharacter3.miss();
						//randomCharacter4.dodge(); //because it's a battle royal, I'd need a method to call for when a character misses another, to fill space
						System.out.println();
					}else if(damageStrength > 3 && damageStrength2 > 3) {
						randomCharacter.attack(damageStrength);
						randomCharacter2.takeDamage(damageStrength);
						System.out.println();

						//randomCharacter3.attack(damageStrength2);
						//randomCharacter4.takeDamage(damageStrength2);
						System.out.println();
					}//somehow, I'd have to have the two characters that have won (randomCharacter and randomCharacter3) get pulled, and then they start fighting each other in another loop
					//I think I'd just get rid of the if statement below and move it to the other loop---that starts running after the other loop
				if(randomCharacter2.health == 0 || randomCharacter2.health < 0 /*&& randomCharacter4.health == 0 || randomCharacter4.health < 0*/)	{
						System.out.println(randomCharacter.name + " wins!");
					}
			}
	
	}

}
