import java.awt.datatransfer.StringSelection;
import java.util.Stack;

public class StringEasyProblem {

	public static void main(String[] args) {

		String str = "the sky is blue";
		String str1 = "(()())(())";

//		Reverse Words in a String
		reverseAWord(str);

//		Remove Outermost Parentheses
		removeOuterParenthesis(str1);
	
	}

	private static void removeOuterParenthesis(String str1) {

		String result = "";
		Stack<Character> stack = new Stack<>();
		for(char ch : str1.toCharArray()) {
			if( stack.isEmpty() && ch=='(') {
				stack.push('(');
				continue;
			}
			else if(ch==')') {
				stack.pop();
				if(stack.isEmpty()) {
					continue;
				}
			}
			if(ch=='(') {
				stack.push('(');
			}
			result=result+ch;
		}

		// another way of solving
//		int count = 0;
//		char[] ch = str1.toCharArray();
//		for (int i = 0; i<ch.length;i++) {
//			if (ch[i] == '(' && count++ > 0) {
//				result += ch[i];
//			}
//			 if(ch[i] == ')' && count-- > 1) {
//				result += ch[i];
//			}
//		}
		
		System.out.println(result);
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
