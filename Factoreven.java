import java.util.*;

class Factoreven

{
public static void main(String[]args)
{
                                     Scanner sc=new Scanner(System.in);
                                    System.out.print("Enetr  number =>");
                                     int number =sc.nextInt();
                                     
                                     int i=1;
                                     int hf=0;
                                    
                                    while(i<number)
                                     {
                                    if(number%i==0 &&  i%2==0)
                                    System.out.print("   "+i);
                                    i++;
                                   }
                                 

                                  
}
}

