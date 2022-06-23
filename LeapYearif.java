import java.util.*;

class LeapYearif

{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);


System.out.println("Enter Any Year=");

int year=sc.nextInt();


if((year % 4==0 && year % 100!=0)||(year %400==0))
{

System.out.println(" year is leap");

}
else
{
 
System.out.println("Year is not leap year");
}


}
}