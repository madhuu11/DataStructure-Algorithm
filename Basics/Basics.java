package takeUforward.Patterns;

import java.util.Scanner;

public class Basics {

	public static void main(String[] args) {
		findDataTypeValue();
		decisionMaking();
		switchCase();

		primeNo();
	}

	private static void primeNo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		int count = 0;
		for(int i=2; i<n; i++) {
			if(n%i==0) {
				count++;
				break;
			}
		}
		if(count == 0) {
			System.out.println(n + " is a prime number");
		}
		else System.out.println(n + " is not a prime number");
	}

	private static void switchCase() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the choice 1 or 2 : ");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			System.out.println("Enter the radius value : ");
			int r = sc.nextInt();
			System.out.println(2.1415*r*r);
			break;
		case 2:
			System.out.println("Enter the length value : ");
			int l = sc.nextInt();
			System.out.println("Enter the breadth value : ");
			int b = sc.nextInt();
			System.out.println(l*b);
			break;

		default:
			break;
		}
	}

	private static void decisionMaking() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n value : ");
		int n = sc.nextInt();
		System.out.println("Enter the m value : ");
		int m = sc.nextInt();

		if (n < m)
			System.out.println("lesser");
		else if (n > m)
			System.out.println("greater");
		else
			System.out.println("equal");
	}

	private static void findDataTypeValue() {
		System.out.println("Enter the Data type name : ");
		Scanner sc = new Scanner(System.in);
		String key = sc.nextLine();
		int n = -1;
		switch (key) {
		case "character":
			n = 2;
			break;
		case "integer":
			n = 4;
			break;
		case "long":
			n = 8;
			break;
		case "float":
			n = 4;
			break;
		case "double":
			n = 8;
			break;
		case "boolean":
			n = 1;
			break;

		default:
			break;
		}

		// java 17 feature
//		int n = switch(key) {
//		case "character" -> 2;
//		case "integer" -> 4;
//		case "long" -> 8;
//		case "float" -> 4;
//		case "double" -> 8;
//		case "boolean" -> 1;
//
//		default -> 4;
//		};

		System.out.println(n);
	}
}
