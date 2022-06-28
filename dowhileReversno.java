

import java.util.*;

class     dowhileReversno

{
     public static void main(String[]args)
   {
    
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a long number ==>");
    long number=sc.nextLong();
    long rev=0; 
    long i=number;


    do
   {
    long digit = i %10;
    
    rev=rev*10+digit;
    
    i=i/10;            
    
    System.out.print("*****");
   }while(i>0);

System.out.println("\nreverse ==>"+rev);




}
  

}