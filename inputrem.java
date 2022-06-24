import java.util.*;

class inputrem

{
     public static void main(String[]args)
   {
    Scanner sc=new Scanner(System.in);
    System.out.print("\t\t\tEnter a long number");
    long number=sc.nextLong();
    long rem=0,i=number;
    
    while(i!=0)
    rem=i%10;
  
   System.out.print(rem+  " ");
    //i=i/10;

}
  

}