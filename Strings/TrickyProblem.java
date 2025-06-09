public class TrickyProblem {
	
	public static void main(String[] args) {
		TrickyProblem tp = new TrickyProblem();
		String str = "abbbcc";
		String str2 = "a1b3c2";
		tp.toAlphaNumeric(str); // abbbcc -> a1b3c2
		tp.toExpansion(str2); // a1b3c2 -> abbbcc
	}

	private void toExpansion(String str) {
		StringBuilder s = new StringBuilder();
		for(int i=0; i<str.length(); i++) {
			if(Character.isAlphabetic(str.charAt(i))) {
				s.append(str.charAt(i));
			}
			else {
				int n = Character.getNumericValue(str.charAt(i));
				for(int x=1; x<n; x++) {
					s.append(str.charAt(i-1));
				}
			}
		}
		System.out.println(s);
	}

	private void toAlphaNumeric(String str) {
		StringBuilder s = new StringBuilder();
		int count = 1;
		for(int i=1; i<str.length(); i++) {
			if(str.charAt(i)==str.charAt(i-1)) count++;
			else {
				s.append(str.charAt(i-1)).append(count);
				count=1;
			}
		}
		s.append(str.charAt(str.length()-1)).append(count);
		System.out.println(s);
	}

}
