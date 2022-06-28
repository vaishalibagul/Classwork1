import java.util.*;

class ArmstrongNumber

{
public static void main(String[]args)
{
                                    Scanner sc=new Scanner(System.in);
                                    System.out.print("Enetr 4 didgit number");
                                     int number =sc.nextInt();
                                    int rem=0;
                                   int sum=0;
                                   int i=number;
                                    while(i!=0)
                                     {
                                 rem=i%10;
                                 sum=sum+(rem*rem*rem*rem);
                                  i=i/10;

                                   }
                                 if(sum==number)
                                 System.out.print("number is Armstrong");
                                  else 
                                  System.out.print("number is  not Armstrong");
}
}

