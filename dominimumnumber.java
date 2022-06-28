import  java.util.*;

class  dominimumnumber

{
public static void main(String[]args)
{

Scanner sc=new Scanner(System.in);
System.out.print("Enter number");
int number=sc.nextInt();
int min= number;
      do
     {
    int rem=number%10;
    if(rem<min){ min=rem;}


number=number/10;
     

     }while(number>0);
      System.out.print("minimum number is= "+min);
  

}
}  