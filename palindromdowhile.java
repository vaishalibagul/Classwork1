

class palindromdowhile
 {
public static void main(String[]args)
{
int counter=10; 
do
{
//palindrom code start

       int number=counter;
       int rev=0;
       int i=number; 
       int rem=0;

      while(i!=0)
      {
       rem=i%10;
       rev=((rev*10)+rem);
       i=i/10;
       }  

       if(rev==number)
        {
       System.out.print("\n\t\t\t Its pelindrome Number =>  "+number);
        }

//palindrom code end
counter++;
}
while(counter<=200);

}
}
