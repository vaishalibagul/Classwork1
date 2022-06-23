import java.util.*;

class  SwitchCalculator

{
public static void main(String[]args)
{
              Scanner sc=new Scanner(System.in);
              System.out.println("\t*******************Calculator*****************");
              System.out.println("\t\t\t+.Addition");
              System.out.println("\t\t\t-.Substraction");
              System.out.println("\t\t\t*.Multiplication");
              System.out.println("\t\t\t/.Divide");

             System.out.println("\t\t\t================");
             System.out.print("\t\t\tEnter your choice=");

              char ch=sc.next().charAt(0);
               System.out.print("\t\t\tEnter first number=");
               int a=sc.nextInt();
               System.out.print("\t\t\tEnter Second number=");
               int b=sc.nextInt();

 

                    switch(ch)
                      {
                     case '+':
                     {
                   int result=a+b;
               System.out.print("\t\t\tAddition=" +result );
                       break;
                 }
                 case '-':
                  {
               int result =a-b;
              System.out.print("\t\t\tSubstraction=" +result );
                 break;
               }
              case '*':
                 {
            int result=a*b;
           System.out.print("\t\t\tMultiplication=" +result );
                break;
             }
            case '/':
            {
         int result=a/b;
         System.out.print("\t\t\tDividation=" +result );
             break;
               }

            default:
            {
          System.out.print("\t\t\twrong input ");
             break;
}
}
}
}

