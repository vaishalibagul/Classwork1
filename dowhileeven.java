

class dowhileeven
   {
public static void main(String[]args)

{
  

       int i=1;
       int sum=0;
       int sum1=0;
       
       
       
        do
        {
  	                   if(i%2==0)
		{
        		sum=sum+i;
        	
		}
                                          if(i%2==1)
		{
        		sum1=sum1+i;
        	
		}
        	
		
       		i++;
      	}while(i<=10);
     
    System.out.print("\n\t\t\t  ***********OUTPUT IS HERE********");
    System.out.print("\n\t\t\t  odd number sum is="        +sum1);

    System.out.print("\n\t\t\t  *******************************");
    System.out.print("\n\t\t\t  Even number sum is="        +sum);
    
}
}