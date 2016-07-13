//: holding/ApplesAndOrangesWithoutGenerics.java
//Simple container example (produces compiler warnings).
//{ThrowsException}
package generics.coffee;

import java.util.*;

class Grammy {
	private static long counter;
	private final long id = counter++;

	public long id() {
		return id;
	}
}

class Mandarine {
}

public class ApplesAndOrangesWithout {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		ArrayList apples = new ArrayList();
		for (int i = 0; i < 3; i++)
			apples.add(new Grammy());
		// Not prevented from adding an Orange to apples:
		apples.add(new Mandarine());
		for (int i = 0; i < apples.size(); i++)
			((Grammy) apples.get(i)).id();
		// Orange is detected only at run time
	}
} /* (Execute to see output) */// :~