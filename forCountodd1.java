import java.util.*;

 class  forCountodd1
 
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
                                       if(i%2==1){
                                       sum=sum+i;
                                       count++;
                                        }
                                        }
                                       System.out.print("\n\t\t odd number is "+i);
                                       System.out.print("\n\t\tSum of all odd number is="+sum);
                                       System.out.print("\n\t\tcount of all odd number is="+count);
}
}
