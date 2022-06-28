import java.util.*;

 class  forNaturalsum
 
{
   public static void  main(String[]args)
  {    
                                           Scanner sc=new Scanner(System.in);
                                           System.out.print("Enter number");
                                           int number =sc.nextInt();  
                                           int i=1;
                                         int sum=0;
                                         for(i=1 ;i<=number;i++)
                                         {
                                        sum=sum+i;
                                        System.out.print("\t\t "+i);
                                        }
                                        System.out.print("Sum of all natural number is="+sum);
}
}
