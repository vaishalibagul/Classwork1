import java.util.*;

class Fabonacicseriesdowhile

{

public static void main(String[]args)
{                  
                                
                      Scanner sc =new Scanner(System.in);
                     System.out.print("Enter number");
                      int number=sc.nextInt();
                     int  a=0,b=1,c=0;
                     int i=2;
                         

                     do
                     {
                     
                    System.out.print(  c+  "  ");
                    c=a+b;
                    a=b;
                    b=c;
                   
                   i++;
                     }while(i<=number);

}
}