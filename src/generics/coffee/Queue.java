package generics.coffee;

import java.util.LinkedList;

public class Queue<ItemType> {
	private LinkedList<ItemType> q = new LinkedList<ItemType>();

	public void enqueue(ItemType item) {
		q.addLast(item);
	}

	public ItemType dequeue() {
		return q.removeFirst();
	}

	public boolean isEmpty() {
		return (q.size() == 0);
	}

}
