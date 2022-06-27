import java.util.*;

class palindrom

 {
public static void main(String[]args)
{

      Scanner sc=new Scanner(System.in);
      System.out.print("\t\t\t Enetr Number=>");

      int number=sc.nextInt();
      int rev=0;
      int i=number; 
      int rem=0;

      while(i!=0)
      {
       rem=i%10;
       rev=(rev*10)+rem;
       i=i/10;
       }  

      if(rev==number)
       System.out.print("\n\t\t\t Its pelindrom Number ");
       else
       System.out.print("\n\t\t\t Its not pelindrom Number ");
}
}
