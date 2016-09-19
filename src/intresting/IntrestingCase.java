package intresting;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
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
	}

}
