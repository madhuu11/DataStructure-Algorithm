public class MergeStringAlternately {
	public static void main(String[] args) {
		String mergedString = mergeAlternately("ab", "xyz");
		System.out.println(mergedString);
	}

	public static String mergeAlternately(String word1, String word2) {

		StringBuilder mergedString = new StringBuilder();
		int minLength = Math.min(word1.length(), word2.length());
		for (int i = 0; i < minLength; i++) {
			mergedString.append(word1.charAt(i));
			mergedString.append(word2.charAt(i));
		}
		if (word1.length() > minLength)
			mergedString.append(word1.substring(minLength));
		if (word2.length() > minLength)
			mergedString.append(word2.substring(minLength));
		return mergedString.toString();
	}
}
