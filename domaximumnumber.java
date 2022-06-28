import  java.util.*;

class  domaximumnumber

{
public static void main(String[]args)
{

Scanner sc=new Scanner(System.in);
System.out.print("Enter number");
int number=sc.nextInt();

int k=0;     
int rem=0;


      do
     {
    rem=number%10;
     if(rem>k)
    k=rem;
number=number/10;
     

     }while(number!=0);
      System.out.print("maximum number is= "+k);
  

}
}  