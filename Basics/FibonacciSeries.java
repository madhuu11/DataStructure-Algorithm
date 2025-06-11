public class FibonacciSeries {
	
	public static void main(String[] args) {
		int n=11;
		fibonacciSeries(n); //get fibonacci series till the given number n
		fibonacciSeriesUsingRecursion(n); //get fibonacci series till the given number n

	}
	
	private static void fibonacciSeriesUsingRecursion(int n) {
		for(int i=0; i<n; i++) {
			System.out.print(f(i) +" ");
		}
	}

	private static int f(int n) {
		if(n==0)return 0;
		else if(n==1) {
			return 1;
		}
		return f(n-1) + f(n-2);
	}

	private static void fibonacciSeries(int n) {
		int first = 0, second = 1;
		System.out.print("fibonacci series of " + n+ " are: "+first+" "+second);
		for(int i=0; i<n; i++) {
			int next = first+second;
			System.out.print(" "+next);
			first =second;
			second=next;
		}
	}
}
