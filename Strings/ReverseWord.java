import java.util.Stack;

public class ReverseWord {
	public static void main(String[] args) {
		
//		Given an input string s, reverse the order of the words.
		String str = "a good   example";
		String strRev = reverse(str);
		System.out.println("The reverse of string "+str+" : "+strRev);

	}

	private static String reverse(String str) {
		String[] word = str.replaceAll("\\s+", " ").split(" ");
		StringBuilder sb = new StringBuilder();
		Stack<String> stack = new Stack<>();
		for (String string : word) {
			stack.add(string);
		}
		while(!stack.isEmpty()) {
			sb.append(stack.pop()).append(" ");
		}
		return sb.toString().trim();
	}
}  
