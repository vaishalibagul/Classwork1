import  java.util.*;

class Searchnumber

{
public static void main(String[]args)
{

Scanner sc=new Scanner(System.in);
System.out.print("Enter number");
int number=sc.nextInt();
System.out.print("Enter number to search");
int Search=sc.nextInt();
     
int rem=0;
int increment=0;

      while(number!=0)
     {
    rem=number%10;
     if(number==Search)
number=number/10;
     increment=1;
     break;  

     }
     
     


    if(increment==1)
    System.out.print("number is found");
    else
    System.out.print(" number not found");

}
}  