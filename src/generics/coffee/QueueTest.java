package generics.coffee;

public class QueueTest {
	public static void main(String[] args) {
		Queue<String> queue = new Queue<String>();
		for (String s : "My java skills are growing".split(" "))
			queue.enqueue(s);
		while (!queue.isEmpty())
			System.out.print(queue.dequeue() + ".");
	}

}
