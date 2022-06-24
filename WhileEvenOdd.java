

class WhileEvenOdd
   {
public static void main(String[]args)

{
  

       int i=201,diff=0;
       int sum=0;
       int sum1=0;
       int CountE=0;//count for even number
       int CountO=0;//count for odd number
       
        while(i<=400)
        {
        if(i%2==0)
        sum=sum+i;
        CountE++;
        if(i%2==1)
        sum1=sum1+i;
        CountO++;
        diff=sum1-sum;
       i++;
      }
     
    System.out.print("\n\t\t\t  ***********OUTPUT IS HERE********");
    System.out.print("\n\t\t\t  odd number sum is="        +sum1);

    System.out.print("\n\t\t\t  *******************************");
    System.out.print("\n\t\t\t  Even number sum is="        +sum);
    System.out.print("\n\t\t\t  *******************************");
    System.out.print("\n\t\t\t  Even Number Is count"        +CountE);
    System.out.print("\n\t\t\t  *******************************");
    System.out.print("\n\t\t\t  odd Number Is count"        +CountO);
    System.out.print("\n\t\t\t  *******************************");
    System.out.print("\n\t\t\t  Difference of even and odd="        +diff);
    System.out.print("\n\t\t\t  *******************************");

}
}