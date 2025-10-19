package projects.collections.csc205;

public interface Bag<T> extends Iterable<T> {
	public boolean isEmpty();
	public int count();
	public void addToBag(T item);
}