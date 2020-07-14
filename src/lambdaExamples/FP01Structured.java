package lambdaExamples;

import java.util.List;

public class FP01Structured {
public static void main(String[] args) {List<Integer> numbers=List.of(12,4,5,8,3,6,12);
	//printall(numbers);
	printallven(numbers);
}

private static void printallven(List<Integer> numbers) {
for(int number:numbers) {
	if(number % 2==0)
	System.out.println(number);
}
}
private static void printall(List<Integer> numbers) {
for(int number:numbers) {
	System.out.println(number);
}
}
}
