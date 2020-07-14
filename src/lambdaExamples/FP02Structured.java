package lambdaExamples;

import java.util.List;

public class FP02Structured {

	public static void main(String[] args) {
		List<Integer> numbers=List.of(12,4,5,8,3,6,12);
		int sum=add(numbers);
		System.out.println(sum);
	}

	private static int add(List<Integer> numbers) {
		int sum=0;
		for(int number:numbers) {
			sum +=number;
		}
		return sum;
	}

}
