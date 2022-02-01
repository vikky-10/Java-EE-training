package Assignments;

import java.util.Scanner;

public class HollowPyramid {

	public static void main(String[] args) {
	    int n,i,j,k;
	    Scanner sc = new Scanner(System.in);
	    n = sc.nextInt();
	    k=(2*n)-1;
	    for(i=n;i>0;i--)
	    {
	        for(j=1;j<=k;j++)
	        {
	            if((j==i)||(j==k-i+1)||(i==1)) { 
	            	System.out.print("*");
	            	}
	            else if((j<i)||(j>k-i)) { 
	            	System.out.print("b");
	            	}
	            else { 
	            	System.out.print("i");
	            	}
	        }
	        System.out.println();	 
	}

}
}
