package intresting;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.List;

public class IntrestingCase {
	/**
	 * 1.How to write method that receive list of child objects
	 */
	class A {
	}

	class B extends A {
	}

	static List<A> aList = new ArrayList<>();
	static List<B> bList = new ArrayList<>();

	public static void listInsertion(List<? extends A> inheritanceList) {

	}

	public static void main(String[] args) {
		/**
		 * 2. How to insert in collection type other than generic
		 */
		List<Integer> integer = new ArrayList<Integer>();
		integer.add(1);
		List objects = integer;
		objects.add("String");
		System.out.println(integer);
		/**
		 * 1.How to write method that receive list of child objects
		 */
		listInsertion(aList);
		listInsertion(bList);
		/**
		 * MultiDemensional Array initialization
		 */
		int[][] arrayDimensional = new int[2][];
		arrayDimensional[0] = new int[5];
		arrayDimensional[0][0] = 1;
		arrayDimensional[0][1] = 2;
		arrayDimensional[0][2] = 3;
		arrayDimensional[0][3] = 4;
		arrayDimensional[0][4] = 5;
		arrayDimensional[1] = new int[5];
		arrayDimensional[1][0] = 1;
		arrayDimensional[1][1] = 2;
		arrayDimensional[1][2] = 3;
		arrayDimensional[1][3] = 4;
		arrayDimensional[1][4] = 5;
		// ArrayIndexOutOfBoundsException
		// arrayDimensional[2] = new int[5];
		// arrayDimensional[2][0] = 1;
		// arrayDimensional[2][1] = 2;
		// arrayDimensional[2][2] = 3;
		// arrayDimensional[2][3] = 4;
		// arrayDimensional[2][4] = 5;

		for (int[] inner : arrayDimensional) {
			for (int num : inner)
				System.out.print(num + " ");
			System.out.println();
		}

		String a = "";
		a += 2;
		a += 'c';
		a += false;
		if (a == "2cfalse")
			System.out.println("true");

		String s = "Hello";
		if ("Hello" == s)
			System.out.println("true");

		int total = 0;
		StringBuilder letters = new StringBuilder("abcdefg");
		 total += letters.substring(1, 2).length();
		 total += letters.substring(6, 6).length();
		// total += letters.substring(6, 5).length();
		 LocalDateTime d = LocalDateTime.of(2015, 5, 10, 11, 22, 33);
		 Period p = Period.ofDays(1).ofYears(2);
		 d = d.minus(p);
		 DateTimeFormatter f = DateTimeFormatter.ofLocalizedDateTime(FormatStyle
		 .SHORT);
		 System.out.println(f.format(d));
	}

}
