package takeUforward.Patterns;

import java.util.Scanner;

public class Basics {

	public static void main(String[] args) {
		findDataTypeValue();
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
