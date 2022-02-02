package Assignments;
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






































// You are using Java
import java.util.*;
class ff{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    int flage=0;
    for(int i=0;i<n;i++){
    arr[i]= sc.nextInt();
    }
    int mnpd=0;
    int mnpm=0;
 
   int sum=0;
   for(int e:arr){
       sum+=e;
   }
  int rem=(sum%n);
   int k=(sum-rem)/n;
   int z=0;
   int mo=0;
   for(int i=0;i<n;i++){
       
       if(arr[i]>k){
           int m=arr[i];
           while(m!=k){
                z++;
                m--;
           }
          
       }else if(arr[i]<k){
           int l=arr[i];
           while(l!=k){
               l++;
               z--;
               mo++;
           }
       }
   }
   mnpd=z;
   mnpm=mo;
   System.out.println(mnpd+" "+mnpm);
    }
}
