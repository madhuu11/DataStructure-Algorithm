import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamPractice {

	public static void main(String[] args) {
//		Combine 2 lists and sort them
		combineListNSort();
		
//		Filter out all even numbers and square odd numbers. Collect the results into a new list.
		squareOddN();
		
	}

	private static void squareOddN() {
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		List<Integer> result = list.stream().filter(i->i%2!=0).map(i->i*i).collect(Collectors.toList());
		System.out.println(result);
	}

	private static void combineListNSort() {
		List<Integer> list1 = Arrays.asList(2,4,6,5);
		List<Integer> list2 = Arrays.asList(1,3);
		List<Integer> combineList = Stream.concat(list1.stream(), list2.stream()).sorted().collect(Collectors.toList());
		System.out.println(combineList);
	}
}
