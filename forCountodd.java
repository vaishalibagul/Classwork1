import java.util.*;

 class  forCounteven
 
{
   public static void  main(String[]args)
  {    
                                           Scanner sc=new Scanner(System.in);
                                           System.out.print("Enter number");
                                           int number =sc.nextInt();  
                                           int i=1;
                                         int sum=0;
                                         int    count=0;
                                         for(i=1 ;i<=number;i++)
                                         {
                                       if(i%2==0)
                                       sum=sum+i;
                                       count++;
                                        
                                        }
                                       System.out.print("\n\t\t even number is "+i);
                                       System.out.print("\n\t\tSum of all even number is="+sum);
                                       System.out.print("\n\t\tcount of all even number is="+count);
}
}
