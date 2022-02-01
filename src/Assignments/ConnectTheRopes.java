package Assignments;

import java.util.Scanner;

public class ConnectTheRopes {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
	 int n=sc.nextInt();
	 int k=sc.nextInt();
	 int arr[]=new int[n];
	 int sum=0;
	 for(int i=0;i<n;i++) {
		 arr[i]=sc.nextInt();
		 arr[i]=arr[i]-k;
	 }
	 for(int e: arr) {
		 sum+=e;
	 }
	 System.out.println(sum);
	 int ans=sum-(k*((arr.length)/2));
	  System.out.println(ans);
	}

// 	    int n,k,i,j=0;
//    Scanner sc = new Scanner(System.in);
//    n = sc.nextInt();
//    k = sc.nextInt();
//    int a[] = new int[n];
//    for(i=0;i<n;i++)
//    {
//        a[i] = sc.nextInt();
//        a[i]=a[i]-k;
//    }
//    for(i=0;i<n;i++)
//    {
//        j=j+a[i]-k;
//    }
//    j=j+k+k;
//    System.out.println(j);

}
