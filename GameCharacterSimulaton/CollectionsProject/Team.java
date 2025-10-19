package projects.collections.csc205;

public interface Team<GameCharacter> extends Iterable<GameCharacter> {
	public void addMember(GameCharacter item);
	public boolean isTeamEmpty();
	public int memberCount();
}