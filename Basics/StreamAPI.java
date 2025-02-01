package java8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamAPI {

	public static void main(String[] args) {

		List<String> name = Arrays.asList("Archana", "Anand", "Sarjana", "Manish");
		List<Integer> intList = Arrays.asList(100, 5, 6, 21, 23, 46, 78, 99, 21);
		String string="helloheaven";

//		Given a list of names, find out names which starts from A using Stream functions
		startsWithA(name);

//		Given a list of integers, find out all the even numbers that exist in the list using Stream functions
		findAllEvenNum(intList);

//		Given a list of integers, find out all the numbers starting with 1 using Stream functions
		findNumStartsWith1(intList);

//		How to find duplicate elements in a given integers list in java using Stream functions
		findDuplicates(intList);

//		Given the list of integers, find the first element of the list using Stream functions
		findFirstElement(intList);
		
//		Given a list of integers, find the total number of elements present in the list using Stream functions
		countElements(intList);
		
//		Given a list of integers, find the maximum value element present in it using Stream functions
		maxValueInList(intList);
		
//		Given a String, find the first non-repeated character in it using Stream functions
		firstNonRepeatedCh(string);
		
//		Given a String, find the repeated character in it using Stream functions
		repeatedCh(string);

//		Given a list of integers, sort all the values present in it using Stream functions
		sortListOfInt(intList);
		
//		Given a list of integers, sort all the values present in it in descending order using Stream functions
		SortValueInDesc(intList);
		
//		Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
		returnTrueIfDuplicates();

//		How will you get the current date and time using Java 8 Date and Time API
		getCurrentDateTime();
		
//		Write a Java 8 program to concatenate two Streams
		concatenateTwoStreams(intList, nameList);

//		Java 8 program to perform cube on list elements and filter numbers greater than 50.
		filterNumGreater50(intList);
		
//		Write a Java 8 program to sort an array and then convert the sorted array into Stream
		sortArrayIntoStream();
				
//		How to use map to convert object into Uppercase in Java 8
		ConvertObjToUpperCase(nameList);
	}

	private static void ConvertObjToUpperCase(List<String> nameList) {
		List<String> n = nameList.stream().map(String::toUpperCase).collect(Collectors.toList()); 
		//if you are collecting result then store it in separate object.
		System.out.println(n);
	}

	private static void sortArrayIntoStream() {
		int[] arr = {2,8,3,9,5};
		Arrays.sort(arr); 
		Arrays.stream(arr).forEach(n -> System.out.print(n + " "));
	}

	private static void filterNumGreater50(List<Integer> intList) {
		intList.stream().map(n -> n*n*n).filter(n -> n>50).forEach(System.out::println);
	}

	private static void concatenateTwoStreams(List<Integer> intList, List<String> nameList) {
		Stream<Object> concat = Stream.concat(intList.stream(), nameList.stream());
		concat.forEach(str -> System.out.print(str + " "));
	}

	private static void getCurrentDateTime() {
		System.out.println("Current local date : "+ java.time.LocalDate.now());
		System.out.println("Current local time : "+ java.time.LocalTime.now());
		System.out.println("Current local date and time : "+ java.time.LocalDateTime.now());
	}
	
	private static void returnTrueIfDuplicates() {
		int[] arr = {1,1,2,3};
//		long n =  Arrays.stream(arr).distinct().count();
//		if(n == Arrays.stream(arr).count()) {
//			System.out.println("true");
//		}else System.out.println("false");
		
		Set<Integer> set = new HashSet<>();
		boolean result = Arrays.stream(arr).anyMatch(n -> !set.add(n));
		System.out.println(result);
	}

	private static void SortValueInDesc(List<Integer> intList) {
		intList.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
	}

	private static void sortListOfInt(List<Integer> intList) {
		intList.stream().sorted().forEach(System.out::println);
	}

	private static void repeatedCh(String string) {
		string.chars().mapToObj(c->(char)c).filter(ch -> string.indexOf(ch)!=string.lastIndexOf(ch)).distinct().forEach(System.out::println);
	}

	private static void firstNonRepeatedCh(String string) {
		string.chars().mapToObj(c->(char)c).filter(ch -> string.indexOf(ch)==string.lastIndexOf(ch)).findFirst().ifPresent(System.out::println);
	}

	private static void maxValueInList(List<Integer> intList) {
		 System.out.println(intList.stream().max(Integer::max).get());
	}

	private static void countElements(List<Integer> intList) {
		long count = intList.stream().count();
		
//		another way of solving
//		long count = Arrays.stream(intList.toArray()).count();
		System.out.println(count);
	}

	private static void findFirstElement(List<Integer> intList) {
		intList.stream().findFirst().ifPresent(System.out::println);
	}

	private static void findDuplicates(List<Integer> intList) {
//		first way of soln
		intList.stream().distinct().forEach(i -> System.out.print(i + ", "));

//		second way of soln
		Set<Integer> set = new HashSet<>(intList);
		List<Integer> list = set.stream().collect(Collectors.toList());
		list.forEach(System.out::println);

		// third way of soln
		Set<Integer> set1 = new HashSet<>();
		intList.stream().filter(i -> !set1.add(i)).forEach(System.out::println);

		// third way of soln
		intList.stream().distinct().forEach(i -> System.out.print(i + " "));

	}

	private static void findNumStartsWith1(List<Integer> intList) {
		intList.stream().filter(i -> i.toString().startsWith("1")).forEach(System.out::println);
		intList.stream().map(i -> i + "").filter(i -> i.startsWith("1")).forEach(System.out::println);
	}

	private static void findAllEvenNum(List<Integer> intList) {
		intList.stream().filter(i -> i % 2 == 0).forEach(System.out::println);
	}

	private static void startsWithA(List<String> name) {
		name.stream().filter(a -> a.startsWith("A")).forEach(System.out::println);
	}

}
