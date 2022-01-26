package Assignments;

import java.util.Arrays;

public class ReferenceTypeVsValueType {

	public static void main(String[] args) {
// TODO Auto-generated method stub

		
//		value type
  int a=10;
  int b=a;
  System.out.println(a);//10
  System.out.println(b);//10
  
  b++;
  System.out.println(a);//10
  System.out.println(b); //11
  
  
//  Reference type both pointing to the same memory 'location

  
  int [] arr=new int[5];
  int [] anotherarray=arr;
  System.out.println(arr);//[I@1d251891
  System.out.println(anotherarray);//[I@1d251891
  
  System.out.println(Arrays.toString(arr));
  System.out.println(Arrays.toString(anotherarray));
  
  arr[1]=45;
  //both going to updated because array is a reference type not value type
  System.out.println(Arrays.toString(arr));//[0, 45, 0, 0, 0]
  System.out.println(Arrays.toString(anotherarray));//[0, 45, 0, 0, 0]

  
  
//  anotherarray=new int[] {4,5,6,7,8};
  
  //here total 3 references arr,anotharray, arr1 

  modify(arr);
  
  
  System.out.println(Arrays.toString(arr));//[0, 45, 0, 78, 0]

  System.out.println(Arrays.toString(anotherarray));//[0, 45, 0, 78, 0]

	}
	
	private static void modify(int []arr1) {
		arr1[3]=78;
		
		//Dereferncing
		arr1=new int[] {1,2,3,4,5};
	}

}
