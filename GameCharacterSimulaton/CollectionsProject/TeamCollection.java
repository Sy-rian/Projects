package projects.collections.csc205;
import java.util.Iterator;
import java.util.Random;

public class TeamCollection {

	public static void main(String[] args) {
		ArrayListTeam<GameCharacter> team1 = new ArrayListTeam<GameCharacter>();
		ArrayListTeam<GameCharacter> team2 = new ArrayListTeam<GameCharacter>();

		Random rand = new Random();
		
		//Team 1, five members
		team1.addMember(new ArcherCharacter());
		team1.addMember(new WielderCharacter());
		team1.addMember(new Assassin());
		team1.addMember(new Gladiator());
		team1.addMember(new BeastTamer());
		/*
		System.out.println("Team 1: " + team1);
		System.out.println("The team is empty?: " + team1.isTeamEmpty());
		System.out.println("There are " + team1.memberCount() + " members on the team.");
		System.out.println();
		*/
		
		//Team 2, five members
		team2.addMember(new MagicCharacter());
		team2.addMember(new WarriorCharacter());
		team2.addMember(new Marksman());
		team2.addMember(new Summoner());
		team2.addMember(new JackOfAllTrades());
		/*
		System.out.println("Team 2: " + team2);
		System.out.println("The team is empty?: " + team2.isTeamEmpty());
		System.out.println("There are " + team2.memberCount() + " members on the team.");		
		System.out.println();
		*/
		
		
		//Iteration
		
		//Team 1
		System.out.println("Team 1: ");
		Iterator<GameCharacter> oneIterator = team1.iterator();
		int team1Strength = rand.nextInt(9)+1;

			while (oneIterator.hasNext()) {
				GameCharacter teamOne = oneIterator.next();
				teamOne.attack(team1Strength);
				//System.out.println(teamOne.attack(damageStrength) + " ");
			}
			int t1TotalStrength = (team1Strength*5);
		//System.out.println("Team 1's damage strength for all attacks was " + team1Strength + ".");
            
			
			
			System.out.println();
			System.out.println("- - - - - - - - - -");
			System.out.println();

			

			//Team 2
        System.out.println("Team 2: ");
        Iterator<GameCharacter> otherIterator = team2.iterator();
		int team2Strength = rand.nextInt(9)+1;

    		while (otherIterator.hasNext()) {
    			GameCharacter teamTwo = otherIterator.next();
    			teamTwo.attack(team2Strength);
                //System.out.println(teamTwo.attack(damageStrength2) + " "); 
    		}
			int t2TotalStrength = (team2Strength*5);

    	//System.out.println("Team 2's damage strength for all attacks was " + team2Strength + ".");
    	
    	
    	
    	//Strongest attack
    	System.out.println();
		System.out.println("= = = = = = = = = =");
		System.out.println();
		System.out.println("Results:");

		
		
    	if(t1TotalStrength > t2TotalStrength) {
    		System.out.println("Team one had the strongest total attack of " + t1TotalStrength + "!");
    	}else if(t2TotalStrength > t1TotalStrength) {
    		System.out.println("Team two had the strongest total attack of " + t2TotalStrength + "!");
    	}else {
    		System.out.println("Both teams have the same total attack of " + t1TotalStrength + "!");
    	}

		
	}

}
