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

//		check whether one string is a rotation of another
		rotateString("aab", "aba");
	
	}

	private static void rotateString(String s, String goal) {
//		String result = s;
//
//		int n=0, l = s.length();
//		while(n < l) {
//			if(result.equals(goal)) {
//				System.out.println("true");
//				return;
//			}
//			result = result.substring(1, l) + result.charAt(0);
//			n++;
//			
//		}
//		System.out.println("false");
		
		// another way
		System.out.println(s.length() == goal.length() && (s+s).contains(goal));
		// s.length() == goal.length() is checked because the input s and goal lengths must be same, 
		// if not then no use of concatination
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
