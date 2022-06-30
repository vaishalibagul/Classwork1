import java.util.*;


class TableNestedfor
{
public static void main(String[]args)
{

       Scanner sc=new Scanner(System.in);
       System.out.println("Enter Any number for Create table");
       int Number=sc.nextInt();
       int i=1;
        int j=1;
       for(i=1;i<=10;i++)
       {
       for(j=1;j<=10;j++)

       System.out.print(i*j+"\t\t");
       
       }

}
}