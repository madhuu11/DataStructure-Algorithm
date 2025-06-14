import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Anagram {

	public static void main(String[] args) {
//		determine if two strings are anagrams of each other.
		String str1 = "listen";
		String str2 = "silent";
		anagrams(str1, str2);
		anagramsUsingStreams(str1, str2);

	}
	
	private static void anagramsUsingStreams(String str1, String str2) {
    // optimal solution - O(n) time complexity
		if(str1.length()!=str2.length()) {
			System.out.println("Strings are not anagram.");
			return;
		}
		Map<Character, Integer> map = new HashMap<>();
		for(char c : str1.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		for(char c : str2.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0)-1);
		}
		System.out.println(map.values().stream().allMatch(i -> i==0)? "Strings are anagrams":"Strings are not anagrams");
	}

	private static void anagrams(String str1, String str2) {
    // sorted the array - O(nlogn)
		if(str1.length()!=str2.length()) {
			System.out.println("Strings are not anagram.");
			return;
		}
		char[] charArray1 = str1.toCharArray();
		char[] charArray2 = str2.toCharArray();
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		System.out.println(Arrays.equals(charArray1, charArray2) ? "Strings are anagrams":"Strings are not anagram");
	}

}
