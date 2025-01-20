package takeUforward.Patterns;

import java.util.Scanner;

public class BasicMaths {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = scanner.nextInt();
		
//		Given a positive integer n, count the number of digits in n that divide n evenly (i.e., without leaving a remainder). Return the total number of such digits.
//		eg : n = 12, no of digits = 2 ie., 1,2. can 12/1 and 12/2? output : 2
//		System.out.println(countDigits(n));
		
//		Reverse Integer
		reverseInt(n);
//		palindrome(n);
		
	}

	private static void palindrome(int n) {
		String s1 = n+"";
		String s2 = "";
		for(int i=s1.length()-1; i>=0; i--){
			s2 += s1.charAt(i);
		}
		if(s1.equals(s2)) {
			System.out.println(n + " is a palindrome. " + s1 +" : "+s2);
		}else {
			System.out.println(n + " is not a palindrome. "+ s1 +" : "+s2);
		}
	}

	private static void reverseInt(int i) {
		int reverse =0;
		while(i>0) {
			int rem = i%10;
			System.out.println("rem = i%10 : "+rem);
			reverse = reverse * 10 + rem;
			System.out.println(reverse);
			i=i/10;
			System.out.println(" i = i/10 : "+i);
		}
		System.out.println(reverse);
	}

	private static int countDigits(int n) {
//		first approach using String and charArray
		
//		String s = Integer.toString(n);
//		char[] nArray = s.toCharArray();
//		int result =0;
//		for (char c : nArray) {
//			int a = Character.getNumericValue(c);
//			if(n%a == 0) {
//				result++;
//			}
//		}
//		return result;
		
//		second and better approach by dividing positive integer by 10
		int result = 0;
		int num = n;
		while(num>0) {
			int rem = num%10; // get remainder of number 
			num = num/10 ; // get quotient by dividing n by 10 and replace n by quotient
			if(n%rem == 0) { // check remainder can divide n evenly, if yes increment result 
				result++;
			}
			
		}
		return result;
	}

}
