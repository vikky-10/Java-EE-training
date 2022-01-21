package Assignments;

public class Break_continue_label {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		continue
		
//			In the case of nested loops in java, the continue
//		 skips the current iteration of the innermost loop
		
//		int i=1,j=1;
////		outer loop
//		while(i<=3){
//		System.out.println("Outer loop"+i);
////		inner loop
//		while(j<=3) {
//			if(j==2) {
//				j++;
//				continue;
//			}
//			System.out.println("Inner loop"+j);
//			j++;
//		}
//		i++;
//		}
		
		
		
		
//		label continue statement
	    // outer loop is labeled as first
	    first:
	    for (int i = 1; i < 6; ++i) {

	      // inner loop
	      for (int j = 1; j < 5; ++j) {
	        if (i == 3 || j == 2)

	          // skips the current iteration of outer loop
	          continue first;
	        System.out.println("i = " + i + "; j = " + j);
	      }
	    }
	}

}
