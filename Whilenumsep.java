import java.util.*;
class Whilenumsep
{
public static void main(String [] args)
{
Scanner sc=new Scanner(System.in);

System.out.print("\n\tEnter the any number want to separate:");
long n=sc.nextLong();

long rem=0;
long i=num;
while(i!=0)
{
	rem=i%10;
	
	System.out.print("\t"+rem+ " ");
	i=i/10;

}
	System.out.print("\n\tThe value of i = "+i);


}
}
