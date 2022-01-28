package Assignments;

import java.util.Scanner;

public class A1patternsearchin {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
 while(t-- >0) {
	String s=sc.next();
//	int s=sc.nextInt();
	int flag=0;
	for(int i=1;i<s.length()-1;i++) {
		if(s.charAt(i)<s.charAt(i-1)) {
			flag=1;
			break;
		}
		
		
	}
	if(flag==1) {
		System.out.println("no");
	}else {
		System.out.println("yes");
	}
	 
}
	
}
}
