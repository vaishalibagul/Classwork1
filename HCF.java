import java.util.*;

class HCF

{
public static void main(String[]args)
{
                                     Scanner sc=new Scanner(System.in);
                                    System.out.print("Enetr  number");
                                     int number1 =sc.nextInt();
                                     System.out.print("Enetr  second  number");
                                     int number2 =sc.nextInt();
                                     int i=1;
                                     int hf=0;
                                    
                                    while(i<=number1 || i<=number2)
                                     {
                                    if(number1%i==0   &&number2%i==0)
                                    hf=i;
                                    i++;
                                   }
                                 
                                 System.out.print("hcf number"+hf);
                                  
}
}

