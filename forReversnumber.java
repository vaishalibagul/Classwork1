import java.util.*;

 class  forReversnumber
 
{
   public static void  main(String[]args)
  {    
                                           Scanner sc=new Scanner(System.in);
                                           System.out.print("Enter number");
                                           int number =sc.nextInt();  
                                           
                                          int rev=0;
                                         int i=number;
                                         for(i=1 ;i<=number;i++)
                                         {
                                          number=i%10;
                                          rev=rev*10+number;
                                           
                                          i=  i/10;
                                        System.out.print("\t\t "+rev);
                                        }
}
}
