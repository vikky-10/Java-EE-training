package ExceptionHandling;

public class Main {

	public static void main(String args[]) {
		
//		Default throw and our catch
//		try {
//			System.out.println(3/0);
//			System.out.println("In try");
//		}catch(ArithmeticException e) {
//			System.out.println("Exception: "+e.getMessage());
//		}catch(Exception e) {
//			System.out.println("can this line print");//nhi if above catch run then this catch not run
//			
//		}
//		finally {
//			System.out.println("Always run");
//		}
//		System.out.println("Hello there!");
		
		
//		Explicit throw an exception 
		
//	1) our throw and default catch
		
		
//		int balance=500;
//		int withdrawlAmount=6000;
//		if(balance<withdrawlAmount) {
//			throw new ArithmeticException("Insufficient balance");
//		}
//		
//		//error messsage is Insufficent balance
//		
//		
//		//if exception occure then below lines not execute beacuse error
//		//is handled by Default catch not our catch machanisme.
//		balance=balance-withdrawlAmount;
//		System.out.println("Transaction successfully completed");
//		System.out.println("Program continue....");
		
		
//		2) our throw and our catch
		
		int balance=500;
		int withdrawlAmount=6000;
		try {
		if(balance<withdrawlAmount) {
			throw new ArithmeticException("Insufficient balance");
		}
		
		balance=balance-withdrawlAmount;
		System.out.println("Transaction successfully completed");
        }catch(ArithmeticException e){
			System.out.println("Exception: "+ e.getMessage());
		}
		System.out.println("Program continue....");
		
	}
	
	
}
