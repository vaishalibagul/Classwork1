import java.util.*;

class ElectricityBillif
{
 public static void main(String[]args)
             {
            Scanner sc=new Scanner(System.in);

           System.out.println("Enter Electricity Units used - ");
           double units=sc.nextDouble();
           double bill=0;

           if(units>250)
           {
           bill=bill+1.50*(units-250);units=250;
           }
           if(units>150)
           {
           bill=bill+1.20*(units-150);units=150;
           }
           if(units>50) 
           {
           bill=bill+0.75*(units-50);units=50;
           }
           if(units<50)
           {
           bill=bill+0.50*units;
           }
           System.out.println("total  bill is="+bill); 



}
}
