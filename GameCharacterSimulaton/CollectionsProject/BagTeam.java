package projects.collections.csc205;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BagTeam<GameCharacter> implements Team<GameCharacter> {
	
	
	MyBag<GameCharacter> teamBag;
	
	public BagTeam() {
		super();
		this.teamBag = new MyBag<GameCharacter>();
	}
	
	@Override
	public Iterator<GameCharacter> iterator() {
		return teamBag.iterator();
	}

	@Override
	public void addMember(GameCharacter item) {
		teamBag.addToBag(item);	
	}

	@Override
	public boolean isTeamEmpty() {
		return (teamBag.count() < 1);
	}

	@Override
	public int memberCount() {
		return teamBag.count();
	}
	
	@Override
	public String toString() {
		return (teamBag + " ");
	}

	
}