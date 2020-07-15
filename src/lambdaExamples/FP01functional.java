package lambdaExamples;

import java.util.Comparator;
import java.util.List;

public class FP01functional {

		public static void main(String[] args) {
			List<Integer> numbers=List.of(12,4,5,8,3,6,12);
			List<String> list=List.of("Spring","Spring Boot","Microservices")	;		//printall(numbers);
			//printalleven(numbers);
			//printallodd(numbers);
			//printallcourses(list);
			//printallcourseswithSpring(list);
			//printallcourseswithatleat4letter(list);
			//printsquaresalleven(numbers);
			//printalloddcubes(numbers);
			//printnoofcharactersincourses(list);
		//	sortdistinc(list);
		//sortednatural(list);
			sortbylength(list);
			}

		/*(2)
		 * private static boolean isEven(int number) { return number%2==0; }
		 */
		/*
		 *  (1) private static void print(int number) { System.out.println(number); }
		 */
		private static void printall(List<Integer> numbers) {
			//(1)numbers.stream().forEach(FP01functional::print);//method reference
			numbers.stream().forEach(System.out::println);
		}
		private static void printalleven(List<Integer> numbers) {
			//(1)numbers.stream().forEach(FP01functional::print);//method reference
			/*(@)
			 * numbers.stream().filter(FP01functional::isEven) .forEach(System.out::println)
			 */;
			 numbers.stream().filter(number -> number%2==0).forEach(System.out::println);
		}
		private static void printallodd(List<Integer> numbers) {
			//(1)numbers.stream().forEach(FP01functional::print);//method reference
			/*(@)
			 * numbers.stream().filter(FP01functional::isEven) .forEach(System.out::println)
			 */;
			 numbers.stream().filter(number -> number%2!=0).forEach(System.out::println);
		}
		private static void printallcourses(List<String> courses) {
			courses.stream().forEach(System.out::println);
		}
		private static void printallcourseswithSpring(List<String> coursess) {
			coursess.stream()
			.filter(courses -> courses.contains("Spring"))
			.forEach(System.out::println);
		}
		private static void printallcourseswithatleat4letter(List<String> coursess) {
			coursess.stream()
			.filter(course -> course.length()>=11)
			.forEach(System.out::println);
		}
		private static void printnoofcharactersincourses(List<String> courses) {
			courses.stream().map(course -> course.length()).forEach(System.out::println);
		}
		private static void printsquaresalleven(List<Integer> numbers) {
			
			 numbers.stream().filter(number -> number%2==0).map(number -> number*number).forEach(System.out::println);
		}
		private static void printalloddcubes(List<Integer> numbers) {
			//(1)numbers.stream().forEach(FP01functional::print);//method reference
			/*(@)
			 * numbers.stream().filter(FP01functional::isEven) .forEach(System.out::println)
			 */;
			 numbers.stream().filter(number -> number%2!=0).map(number -> number*number*number).forEach(System.out::println);
		}
		private static void sortdistinc(List<String> coursess) {
			coursess.stream()
			.distinct().sorted().forEach(System.out::println);;
		}
		private static void sortednatural(List<String> coursess) {
			coursess.stream()
			.sorted(Comparator.naturalOrder()).forEach(System.out::println);;
		}
		private static void sortbylength(List<String> coursess) {
			coursess.stream()
			.sorted(Comparator.comparing(str -> str.length())).forEach(System.out::println);;
		}
}
