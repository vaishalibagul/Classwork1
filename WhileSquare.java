

class WhileSquare
   {
public static void main(String[]args)

{
  

         int i=1;
          int sum=0;
           System.out.print("\t\t\t\tNumber   Square");
          while(i<=10)
        {
        int Square=i*i;
      System.out.print("\n\t\t\t\t"+i+"  "    +Square);
         sum=sum+Square;
       
     i++;

      }
    
     
  System.out.print("\n\t\t\tTotal\t"        +sum);
  

}
}