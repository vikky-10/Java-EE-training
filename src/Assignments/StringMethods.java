package Assignments;

public class StringMethods {

	public static void main(String[] args) {
//    String s="Vikky Singh";
//    System.out.println(s.length());
//    System.out.println(s.charAt(5));
//    System.out.println(s.toUpperCase());
//    System.out.println(s.toLowerCase());
//    
//    String s1="   dev simple   		";
//    System.out.println(s1.trim());
//    System.out.println(s1.indexOf('e'));
//    
//    
//    String s3= "deev of deev";
//    System.out.println(s3.indexOf('e'));
//    System.out.println(s3.lastIndexOf('e'));
//    System.out.println(s3.contains("eev"));//true
//    System.out.println(s.substring(2,6));
//    System.out.println(s3.subSequence(1,6));
    
    
    String s4="Ishant Sir";
    String s5="ISHANT SIR";
    String s6="Ishant Sir";
    String s7="Vikky singh";
    System.out.println(s4==s5);//false
    
    //case Sensitive
    System.out.println(s4==s6);//true
    System.out.println(s4==s7);//false
    System.out.println(s4.equals(s5));//false
    System.out.println(s4.equals(s6));//true
    System.out.println(s4.equals(s7));//false
    
    
    
    
    
    
	}

}
