import  java.util.*;

class PrimeNumber

{
public static void main(String[]args)
{

Scanner sc=new Scanner(System.in);
System.out.print("Enter number");
int number=sc.nextInt();
System.out.print("Enter number");
int i=sc.nextInt();
     


      while(i<=number)
     {

     if(number%i==0)
     
     break;  
     i++;   
     }


    if(number==i)
    System.out.print("its prime number");
    else
    System.out.print("its not prime number");

}
}  