package Assignments;

public class WraperClass {

	public static void main(String[] args) {
	 /*
	  *The wrapper class in Java provides the mechanism to convert primitive into object 
	  *and object into primitive.
  
       Since J2SE 5.0, autoboxing and unboxing feature convert primitives into objects 
       and objects into primitives automatically. 
       The automatic conversion of primitive into an object is known as autoboxing 
       and vice-versa unboxing.
 
	  * 
	  */
		
		int a=10;
		Integer b=a;
		Integer c=b;
//		System.out.println(a);
//		System.out.println(b);
		
		/*
		 * Benefit of wrapper class is they comes with usefull methods
		 * like String 
		 */

//           System.out.println(b.hashCode());//10
//           System.out.println(c.hashCode());//10
           
           Integer r= 12345;
           System.out.println();
           
		
	}

}
