package collections;

import rope.*;
import static rope.Rope.*;

public class RopeSwing {
	private static Rope rope1 = new Rope();
	private static Rope rope2 = new Rope();
	{
		System.out.println(rope1.length);
	}

	public static void main(String[] args) {
		rope1.length = 2;
		rope2.length = 8;
		System.out.println(rope1.length);
		String s1 = "hello";
		String s2 = s1;
		s2 = s2 + "1";
		System.out.println(s1 + " " + s2);
	}
}