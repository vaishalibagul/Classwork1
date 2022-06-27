

import java.util.*;
     
class factorial
{
public static void main(String[]args)
{
          Scanner sc=new Scanner(System.in);
          System.out.print("\n\t\tEnetr number to find factorial=>");
          int number=sc.nextInt();
          int i=number,fact=1;
   
           while(i>0)
           {
           fact=fact*i;

           i--;

            }
           System.out.print("\t\t\t************");
           System.out.print("\n\t\t\tfactorial is ="+fact);
}
}
