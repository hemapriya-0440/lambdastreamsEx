package lambdaExamples;

import java.util.List;
import java.util.stream.Collectors;

public class FP03functional {

	public static void main(String[] args) {
		List<Integer> numbers=List.of(12,4,5,8,3,6,12);
		List<Integer> doublednumbers=doubleList(numbers);
		System.out.println(doublednumbers);
		System.out.println(evennolist(numbers));
		List<String> list=List.of("Spring","Spring Boot","Microservices")	;
		System.out.println(listcourselength(list));
	}

	private static List<Integer> doubleList(List<Integer> numbers) {
		return numbers.stream().map(number -> number*number).collect(Collectors.toList());
	}
	private static List<Integer> evennolist(List<Integer> numbers) {
		return numbers.stream().filter(number -> number % 2==0).collect(Collectors.toList());
	}
	private static List<Integer> listcourselength(List<String> courses) {
		return courses.stream().map(str -> str.length()).collect(Collectors.toList());
	}

}
