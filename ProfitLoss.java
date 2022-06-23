 import java.util.*;

class ProfitLoss
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);

System.out.print("\t\tEnter cost price=");
double Costprice= sc.nextDouble();

System.out.print("\t\tEnter seller price=");
double Sellerprice= sc.nextDouble();

if(Sellerprice>1000)
{
double	discount= 0.2;
double profit=(Sellerprice-Costprice)*0.2;
System.out.print("\n\t\t Made profit:"+profit);
}
       else
{
    double Loss=Costprice-Sellerprice;
    
System.out.print("\n\t\t Loss incurred:"+Loss);
}
}
}

