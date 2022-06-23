import java.util.*;

class Asciichar
{
public static void main(String[]args)
{
              Scanner sc=new Scanner(System.in);
              System.out.println("Enter Any key two check its alphabet,digit or special symbol");
              char ch=sc.next().charAt(0);
              
             if(ch>=48 && ch<=57) 	
              {
            System.out.println("Its Digit");
              }

            else if(ch>=65 && ch<=90) 
              {
            System.out.println("Its Capital alphabet");
              }
             else if (ch>=97 && ch<=122)
              {
            System.out.println("Its Small alphabet");
              }
            else
              {
            System.out.println("Its special symbol");
               }

}

}