public class PrimeOrNot {
	
	public static void main(String[] args) {
		int n=11;
		primeNo(n);
	}
	
	public static void primeNo(int n) {
		boolean isPrime = true;
		for(int i=2; i<n/2; i++) {
			if(n%2==0) {
				isPrime = false;
				break;
			}
		}
		System.out.println(n + (isPrime ? " is not a prime number ":" is a prime number"));
	}
}
