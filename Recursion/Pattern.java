public class Pattern {
	public static void main(String[] args) {
		pyramid(4);
	}

	private static void pyramid(int n) {
		if(n==0) return;
		pyramid(n-1);
		System.out.println("*".repeat(n));
	}

}
