package lambdaExamples;

import java.util.List;

public class FP02unctional {

	public static void main(String[] args) {
		List<Integer> numbers=List.of(12,4,5,8,3,6,12);
		System.out.println(numbers.stream().reduce(Integer.MIN_VALUE, (x,y)-> x>y ? x:y));
		System.out.println(numbers.stream().reduce(Integer.MAX_VALUE, (x,y)-> x>y ? x:y));
		//   0   12
		//   12   4,
		//   16    5
		//   21`		8
		//,  29		3
	//	    ,32		6
	//	    ,38		12
	//	,    50		
		
	  int sum=addlist(numbers); 	
	  System.out.println(sum);
	 System.out.println( sqaureandaddsquares(numbers));
	System.out.println(sumofodd(numbers));
	}

	/*
	 * public static int sum(int aggregator,int nxtnumber) {
	 * 
	 * System.out.println(aggregator +"" + nxtnumber); return aggregator+nxtnumber;
	 * }
	 */
	
	  private static int addlist(List<Integer> numbers) { return
	  numbers.stream().reduce(0, (x,y) -> x+y); }
	  private static int sqaureandaddsquares(List<Integer> numbers) { return
			  numbers.stream().map(x -> x*x).reduce(0, (x,y) -> x+y); 
}
	  private static int sumofodd(List<Integer> numbers) { return
			  numbers.stream().filter(x -> x%2 == 0).reduce(0, (x,y) -> x+y);
}
	  }
