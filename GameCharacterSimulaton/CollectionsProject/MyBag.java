package projects.collections.csc205;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyBag<T> implements Bag<T> {
	
	List<T> bag;

	public MyBag() {
		super();
		this.bag = new ArrayList<T>();
	}
	
	@Override
	public Iterator<T> iterator() {
		return bag.iterator();
	}

	@Override
	public boolean isEmpty() {
		return (bag.size() < 1);
	}

	@Override
	public int count() {
		return bag.size();
	}

	@Override
	public void addToBag(T item) {
		bag.add(item);

	}

	@Override
	public String toString() {
		return (bag + " ");
	}
	
	

}