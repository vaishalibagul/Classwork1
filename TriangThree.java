import java.util.*;

class TriangThree

{
public static void main(String[]args)
{
                         Scanner sc=new Scanner(System.in);
                         System.out.print("\t\t\tEnter First side=");
                         double side1=sc.nextDouble();

                         System.out.print("\t\t\tEnter Second side=");
                         double side2=sc.nextDouble();


                         System.out.print("\t\t\tEnter Third side=");
                         double side3=sc.nextDouble();

                         if(side1==side2 && side2==side3 && side3==side1)
                         {
                         System.out.print("\n\t\t\t it is Equilateral  triangle");
                         System.out.print("\n\t\t\t****************************** ");
                         }

                         else if(side1==side2 && side2==side3 || side1==side3)
                         {
                         System.out.print("\n \t\t\t it is isosceles triangle");
                         System.out.print("\n\t\t\t****************************** ");
                          }
                   

                         else
                         {
                         System.out.print("\n\t\t\t it is scalene triangle");
                         System.out.print("\nss\t\t\t****************************** ");
                          }

}
}