package projects.collections.csc205;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class ArrayListTeam<GameCharacter> implements Team<GameCharacter> {
		
		List<GameCharacter> team = new ArrayList<GameCharacter>();
	
		public ArrayListTeam() {
			super();
			this.team = new ArrayList<GameCharacter>();
		}

		@Override
		public Iterator<GameCharacter> iterator() {
			return team.iterator();
		}


		@Override
		public String toString() {
			return (team + " ");
		}

		@Override
		public void addMember(GameCharacter item) {
			team.add(item);
			
		}

		@Override
		public boolean isTeamEmpty() {
				return 	(team.size() < 1);
		
		}

		@Override
		public int memberCount() {
			return team.size();
		}
	}