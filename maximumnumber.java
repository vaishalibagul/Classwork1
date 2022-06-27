import  java.util.*;

class  maximumnumber

{
public static void main(String[]args)
{

Scanner sc=new Scanner(System.in);
System.out.print("Enter number");
int number=sc.nextInt();

int k=0;     
int rem=0;


      while(number!=0)
     {
    rem=number%10;
     if(rem>k)
    k=rem;
number=number/10;
     

     }
      System.out.print("maximum number is= "+k);
  

}
}  