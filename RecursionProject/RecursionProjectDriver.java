package projects.recursion;

import java.util.Arrays;
import java.util.List;

public class RecursionProjectDriver {

	public static void main(String[] args) {
		List<Integer> testValues = Arrays.asList(1, 5, 10, 20);

		System.out.println("Project 4 Testing:");

		// Test Fibonacci
		System.out.println();
		System.out.println("Fibonacci:");
		System.out.print("  ");
		for (Integer ii : testValues) {
			System.out.print(RecursionProject.fib(ii) + "   ");
		}
		System.out.println();

		// Test power function
		System.out.println();
		System.out.println("Power:");
		for (Integer ii : testValues) {
			System.out.print("  ");
			for (int jj = 0; jj < 6; jj++) {
				System.out.print(ii + "^" + jj + "=" + RecursionProject.power(ii, jj) + "   ");
			}
			System.out.println();
		}

		// Test the Ackermann function
		System.out.println();
		System.out.println("Ackermann:");
		testValues = Arrays.asList(1, 2, 3);
		for (Integer ii : testValues) {
			System.out.print("  ");
			for (int jj = 0; jj < 5; jj++) {
				System.out.print(RecursionProject.ackermann(ii, jj) + "\t");
			}
			System.out.println();
		}
		System.out.println();

		// Test balance function
		System.out.println("Balance:");
		System.out.print("  ");
		System.out.print("[10 20]: " + RecursionProject.balance(10, 20) + "    ");
		System.out.print("[20 10]: " + RecursionProject.balance(20, 10) + "    ");
		System.out.print("[10 21]: " + RecursionProject.balance(10, 21) + "    ");
		System.out.println();
		System.out.print("  ");
		System.out.print("[21 10]: " + RecursionProject.balance(21, 10) + "    ");
		System.out.print("[10 10]: " + RecursionProject.balance(10, 10) + "    ");
		System.out.print("[10 11]: " + RecursionProject.balance(10, 11) + "    ");
		System.out.println();

		// Test the Pi approximation function
		System.out.println();
		testValues = Arrays.asList(5, 20, 50);
		System.out.println("Pi:");
		System.out.print("  ");
		for (Integer ii : testValues) {
			System.out.print("[" + ii + "] : " + String.format("%.3f", RecursionProject.pi_approximation(ii)) + "     ");
		}
		System.out.println();

		System.out.println();
		System.out.println("isPalindrome:");
		String[] testStrings = { "a", "ab", "aa", "aba", "aabcbaa", "abcdba", "aabbccbbaa", "notapalindrome" };
		for (String str : testStrings) {
			if (RecursionProject.isPalindrome(str)) {
				System.out.println("  " + str + " is a palindrome.");
			} else {
				System.out.println("  " + str + " is NOT a palindrome.");
			}
		}

		System.out.println();
		System.out.println("monotonicallyIncreasing:");
		Integer[][] testArrays = { { 1 }, { 1, 2, 3 }, { 3, 2, 1 }, { 1, 2, 3, 1 }, { 9, 8, 7 }, { 1, 2 }, { 2, 1 } };
		for (Integer[] a : testArrays) {
			if (RecursionProject.monotonicallyIncreasing(a)) {
				System.out.print("  ");
				printArray(a);
				System.out.println(" is monotonically increasing.");
			} else {
				System.out.print("  ");
				printArray(a);
				System.out.println(" is NOT monotonically increasing.");
			}
		}
	}

	public static void printArray(Integer[] a) {
		for (int ii = 0; ii < a.length; ii++) {
			System.out.print(a[ii].toString() + " ");
		}

	}

}
