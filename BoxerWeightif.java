import java.util.*;

class BoxerWeightif
{

public static void main(String[]args)
{
               Scanner sc=new Scanner(System.in);

               System.out.print("\t\t\tEnter Boxer Weight=");
               double boxerweight=sc.nextDouble();

               if(boxerweight<=115)
               {
               System.out.print("\n\t\t\tBoxer Weight Class is Flyweight");
               System.out.print("\n\t\t\t*******************************");
               }

              else if(boxerweight>115 && boxerweight<=121)
              {
              System.out.print("\n\t\t\tBoxer Weight Class is BantamWeight ");
              System.out.print("\n\t\t\t*******************************");
               }

              else if(boxerweight>122 && boxerweight<=153)
              {
             System.out.print("\n\t\t\tBoxer Weight Class is FeatherWeight");
             System.out.print("\n\t\t\t*******************************");
               }

             else if(boxerweight>154 && boxerweight<=189)
              {
            System.out.print("\n\t\t\tBoxer Weight Class is MiddleWeight");
              }
            else if(boxerweight>=190)
             {
            System.out.print("\n\t\t\tBoxer Weight Class is HeavyWeight");
             }

}
}
