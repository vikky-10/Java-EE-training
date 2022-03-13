package Assignments;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
class recursion 
{
    int fact(int n) 
    {
        int result;
        if (n == 1)
            return 1;
        result = fact(n - 1) * n;
        return result;
    }
}
public class Main {

	public static void main(String[] args) {
		   recursion obj = new recursion() ;
           System.out.print(obj.fact(5));
		// TODO Auto-generated method stub
//Scanner sc=new Scanner(System.in);
//int n=sc.nextInt();
//int arr[]=new int[n];
//for(int i=0;i<n;i++) {
//	arr[i]=sc.nextInt();
//}
//int count=0;
// Map<Integer,Integer>ans=new HashMap<>();
// for(int i=0;i<n;i++) {
//	 if(ans.containsKey(arr[i])) {
//		 ans.put(arr[i],ans.get(arr[i])+1);
//		 
//	 }else {
//		 ans.put(arr[i], 1);
//	 }
// }
// for(Map.Entry<Integer, Integer>e:ans.entrySet()) {
//	 if(e.getValue()==1) {
//		 count=count+1;
//	 }
//	 
// }
// int max=0;
// int num=arr[0];
// int fre=0;
// for(int e: arr) {
//	 fre=ans.get(e);
//	 if(fre>max) {
//		 max=fre;
//		 num=e;
//	 }
// }
// int x=ans.get(num);
// int y=n-x;
// System.out.println(y);
 
 
 
 
 
 
 
 
//		int arr[][] = new int[4][]; 
//		arr[0] = new int[1]; 
//		arr[1] = new int[2]; 
//		arr[2] = new int[3]; 
//		arr[3] = new int[4]; 
//        int i, j, k = 0; 
//		for (i = 0; i < 4; i++) 
//		{ 
//			for (j = 0; j < i + 1; j++) 
//			{ 
//				arr[i][j] = k; 
//				k++; 
//			} 
//		} 
//		for (i = 0; i < 4; i++) 
//		{ 
//			for (j = 0; j < i + 1; j++) 
//			{ 
//				System.out.print(" " + arr[i][j]); 
//				k++; 
//			} 
//			System.out.println(); 
//		}  
//		 int array_variable[][] = {{ 1, 2, 3}, { 4 , 5, 6}, { 7, 8, 9}};
//         int sum = 0;
//         for (int i = 0; i < 3; ++i)
//             for (int j = 0; j <  3 ; ++j)
//                 sum = sum + array_variable[i][j];
//         System.out.print(sum / 5);
//		int arr[] = new int[] {0 , 1, 2, 3, 4, 5, 6, 7, 8, 9};
//        int n = 6;
//        n = arr[arr[n] / 2];
//        System.out.println(arr[n] / 2);
//		  int arr[][] = new int[3][];
//          arr[0] = new int[1];
//          arr[1] = new int[2];
//          arr[2] = new int[3];               
//	    int sum = 0;
//	    for (int i = 0; i < 3; ++i) 
//	        for (int j = 0; j < i + 1; ++j)
//                  arr[i][j] = j + 1;
//	    for (int i = 0; i < 3; ++i) 
//	        for (int j = 0; j < i + 1; ++j)
//                  sum += arr[i][j];
//	    System.out.print(sum); 
//		int arr1[] = {1, 2, 3}; 
//		int arr2[] = {1, 2, 3}; 
//		if (arr1 == arr2) 
//			System.out.println("Same"); 
//		else
//			System.out.println("Not same");
//		int arr1[] = {1, 2, 3}; 
//		int arr2[] = {1, 2, 3}; 
//		if (Arrays.equals(arr1, arr2)) 
//			System.out.println("Same"); 
//		else
//			System.out.println("Not same");
	}

}
