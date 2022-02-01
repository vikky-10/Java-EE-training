//package Assignments;
//
//import java.util.Scanner;
//
//public class loop {
//
//	public static void main(String[] args) {	 
//Scanner sc=new Scanner(System.in);
//int start=sc.nextInt();
//int last=sc.nextInt();
//int count=0;
//for(int i=start;i<=last;i++) {
//boolean ans=AES(i);
//if(ans) {
//	count++;
//}
//}
//System.out.println(count);
//	}
//
//	private static boolean AES(int N) {
//		 int factors = 0;
//		   for(int i = 1; i < (int)Math.sqrt(N); i++){
//		      if(N % i == 0&&i*i!=N){
//		         factors +=2;
//		      }else if(i*i==N) {
//		    	  factors++;
//		      }
//		   }
//		   if(factors == 4){
//		      return true;
//		   }
//		   return false;
//		 
//	}
//
//}
