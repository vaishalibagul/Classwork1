import java.util.*;

class dowhilepalindrome

 {
public static void main(String[]args)
{

       Scanner sc=new Scanner(System.in);
       System.out.print("\t\t\t Enetr Number=>");

       int number=sc.nextInt();
       int rev=0;
       int i=number; 
       int rem=0;

      do
      {
       rem=i%10;
       rev=((rev*10)+rem);
       System.out.print("\n\t\t\t number      "+rev);
       i=i/10;
       }  while(i!=0);

       if(rev==number)
        {
       System.out.print("\n\t\t\t************** ");
       System.out.print("\n\t\t\t Its pelindrome Number ");
        }

       else
       System.out.print("\n\t\t\t Its not pelindrome Number ");
}
}
