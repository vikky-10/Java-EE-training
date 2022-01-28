package Assignments;
import java.util.*;
public class calender {
public static void main(String args[]) {
	 Scanner scanner = new Scanner(System.in);
     int t = scanner.nextInt();
     while(t-- > 0){
         int n = scanner.nextInt();
         int leap=0,nonLeap=0;
		        for(int i = 1900;i<n;i++)
		        {
 		        if(i%4==0 && ((i%400==0) || (i%100!=0)))
 		        {
 		            leap++;
 		        }
 		        else{
 		            nonLeap++;
 		        }
		        }
		        int day = ((leap*366) + (nonLeap*365))%7;
             switch(day){
                 case 0:
                     System.out.println("monday");
                     break;

                 case 1: 
                     System.out.println("tuesday");
                     break;

                 case 2: 
                     System.out.println("wednesday");
                     break;

                 case 3: 
                     System.out.println("thursday");
                     break;
                 
                 case 4: 
                     System.out.println("friday");
                     break;
                 
                 case 5: 
                     System.out.println("saturday");
                     break;
                 
                 case 6:
                     System.out.println("sunday");
                     break;

             }
     }
}
}
