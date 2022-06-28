import java.util.*;
class seprate
{
public static void main(String [] args)
{
Scanner sc=new Scanner(System.in);

System.out.print("\n\tEnter the any number want to separate:");
long num=sc.nextLong();

long rem=0;
long i=num;

                       do
                       { 
	rem=num%10;
	
	System.out.print("\t"+rem+ " ");
                      num=num/10;
                    }  while(num!=0);
                       
                        


}
}
