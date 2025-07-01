package dateWiseTopic;

public class GCDOfStrings {

// Greatest Common Divisor of Strings
	public static void main(String[] args) {
		String result = gcdOfStrings("ababab", "abab");
		System.out.println(result);
	}
	
	public static String gcdOfStrings(String str1, String str2) {
        if(!(str1+str2).equals(str2+str1)) return "";
        int range= gcp(str1.length(), str2.length());
        return str1.substring(0, range);
    }

	private static int gcp(int a, int b) {
		return b==0 ? a : gcp(b, a%b);
	}
}
