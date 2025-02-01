import java.awt.datatransfer.StringSelection;
import java.util.Stack;

public class StringEasyProblem {

	public static void main(String[] args) {

		String str = "the sky is blue";
		String str1 = "(()())(())";

//		Reverse Words in a String
		reverseAWord(str);
	
	}

	private static void reverseAWord(String str) {
		String[] strings = str.split("\\s+");
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = strings.length - 1; i >= 0; i--) {
			stringBuilder.append(strings[i]);
			if (i != 0) {
				stringBuilder.append(" ");
			}
		}
		System.out.println(stringBuilder.toString().trim());
	}
}
