import java.util.*;

class SpecialChar
{
public static void main(String[]args)
{
              Scanner sc=new Scanner(System.in);
              System.out.print("\n\t\t\tEnter Any key =");
              

              char ch=sc.next().charAt(0);
              
             if(ch>='0' && ch<='9') 	
              {
            System.out.print("\t\t\t Its Digit");
              
            System.out.print("\n\t\t\t***************************************");
              }

            else if(ch>='a' && ch<='z') 
              {
            System.out.print("\t\t\tIts small alphabet");
            
            System.out.print("\n\t\t\t**************************************************");
              }
             
              else
              {
            System.out.print("\t\t\t Its special symbol");
             
             System.out.print("\n\t\t\t*************************************************");
               }

}

}