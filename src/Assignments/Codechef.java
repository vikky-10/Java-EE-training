package Assignments;

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
//	  int t;cin>>t;
//	    while(t--){
//	        int x,i;
//	        cin>>x;
//	        int d=0,n=0,c=0;
//	        char a[14];
//	        for(i=0;i<14;i++){
//	            cin>>a[i];
//	            switch(a[i]){
//	                case 'C': c+=2;
//	                        break;
//	                case 'N': n+=2;
//	                        break;
//	                case 'D': c+=1;n+=1;
//	                        break;
//	            }
//	        }
//	        (c>n)? cout<<60*x : ((c!=n)? cout<<40*x : cout<<55*x);
//	        printf("\n");         
//	    }
//	4
//	100
//	CCCCCCCCCCCCCC
//	400
//	CDCDCDCDCDCDCD
//	30
//	DDCCNNDDDCCNND
//	1
//	NNDNNDDDNNDNDN
     
	public static void main (String[] args) throws java.lang.Exception
	{
		 try{
//			 Scanner sc = new Scanner(System.in);
//		        int t = sc.nextInt();
//		        while(t-- > 0){
//		            int x = sc.nextInt();
//		            String s = sc.next();
//		            
//		            int carlson=0;
//		            int chef=0;
//		            
//		            char[] arr = s.toCharArray();
//		            for(char ch:arr){
//		             
//		                if(ch == 'C'){
//		                    carlson=carlson+2;
//		                }else if(ch == 'N'){
//		                    chef=chef+2;
//		                }else{
//		                    carlson++;
//		                    chef++;
//		                }
//		            }
//		            
//		            if(carlson > chef){
//		                System.out.println(60*x);
//		            }else if(chef > carlson){
//		                System.out.println(40*x);
//		            }else if(chef == carlson){
//		                System.out.println(55*x);
//		            }
//		            
//		        }
//				Scanner sc=new Scanner(System.in);
//				int t=sc.nextInt();
//				while(t-- >0){
//				     int count=0;
//				    int n=sc.nextInt();
//				    int arr[]=new int[n];
//				   
//				    for(int i=0;i<n;i++){
//				    	arr[i]=sc.nextInt();
//				        int x=1+count+i;
//				        if(x==arr[i]){
//				            count++;
//				        }
//				    }
//				    System.out.println(count);
//				    
//				}
//    

//			 Scanner sc=new Scanner(System.in);
//			 int t=sc.nextInt();
//			 while(t-- >0) {
//				 int n=sc.nextInt();
//				 String str=sc.next();
//				
//				 int zero=0,one=0;
//				 for(int i=0;i<str.length();i++) {
//					 if(str.charAt(i)=='0') {
//						 zero++;
//					 }else {
//						 one++;
//					 }
//				 }
//				 
// 
//				 
//				 if((n&1)!=1) {
//					 if(zero==one) {
//						 System.out.println("Yes");
//					 }else if(zero==n||one==n) {
//						 System.out.println("Yes");
//					 }else if(((zero&1)!=1)&&((one&1)!=1)) {
//						 System.out.println("yes");
//					 }else {
//						 System.out.println("No");
//					 }
//				 }else {
//					 System.out.println("YEs");
//				 }
//			 }
			 Scanner sc=new Scanner(System.in);
			 int t=sc.nextInt();
			 while(t-->0) {
				 int n=sc.nextInt();
				 int flag=0;
				 int arr[]=new int[n];
				 for(int i=0;i<n;i++) {
					 arr[i]=sc.nextInt();
				 }
				 int a[]=new int[n];
				 for(int i=0;i<n;i++) {
					 a[i]=arr[i];
				 }
				 Arrays.sort(a);
				 
				 for(int i=0;i<n;i++) {
					 for(int j=n-1;j>i;j--) {
						 if((arr[i]&arr[j])==0) {
							 continue;
						 }else {
							 if(arr[i]>arr[j]) {
								 int temp=arr[i];
								 arr[i]=arr[j];
								 arr[j]=temp;
							 }else {
								 continue;
							 }
						 }
					 }
				 }
				 for(int i=0;i<n;i++) {
					 if(arr[i]!=a[i]) {
						 flag=1;
						 break;
					 }
				 }
 				 
			 }
			 
		 }catch(Exception e){
		     return ;
		 }
	}
}
