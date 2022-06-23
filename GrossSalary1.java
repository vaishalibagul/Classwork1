import java.util.*;

class GrossSalary1
{

public static void main(String[]args)
{
                   Scanner sc=new Scanner(System.in);

                   System.out.println("Enter Basic salary = ");
                   int BasicSalary = sc.nextInt();

                   if(BasicSalary<=10000)
                   {
                   int HRA = (BasicSalary*20)/80;
                   int DA =  (BasicSalary*80)/80;
                   int GrossSalary = BasicSalary + HRA + DA;
                   System.out.println("Gross Salary  salary = "+GrossSalary);
                   }

                   else if(BasicSalary<=20000)
                   {
                   int HRA = (BasicSalary*25)/80;
                   int DA =  (BasicSalary*90)/80;
                   int GrossSalary = BasicSalary + HRA + DA;
                   System.out.println("Gross Salary  salary = "+GrossSalary);
                   }

                   else if(BasicSalary>20000)
                   {
                   int HRA = (BasicSalary*30)/80;
                   int DA =  (BasicSalary*95)/80;
                   int GrossSalary = BasicSalary + HRA + DA;
                   System.out.println("Gross Salary  salary = "+GrossSalary);
                   }
}
}