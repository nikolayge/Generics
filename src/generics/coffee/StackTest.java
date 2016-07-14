//: holding/StackTest.java

package generics.coffee;
import java.util.*;

public class StackTest {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		for (String s : "What are main topics about using Git as a source control".split(" "))
			stack.push(s);
		while (!stack.empty())
			System.out.print(stack.pop() + " ");
	}
}
