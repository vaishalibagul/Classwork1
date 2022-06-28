import  java.util.*;

class dowhileFrequency

{
public static void main(String[]args)
{

Scanner sc=new Scanner(System.in);
System.out.print("Enter number");
int number=sc.nextInt();
System.out.print("Enter number to find frequency");
int frequency=sc.nextInt();
     
int rem;
int increment=0;

      do
     {
    rem=number%10;
     if(rem==frequency)
   {

     increment++;
  }
     number=number/10;

     }while(number!=0);
     
     


    if(increment>0)
    System.out.print("number Frequency is ="+increment);
    else
    System.out.print(" number not found");

}
}  