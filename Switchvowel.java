import java.util.*;

class  Switchvowel

{
	public static void main(String[]args)
	{
           	Scanner sc=new Scanner(System.in);
           	System.out.println("\t\t\t***********************************");
           	System.out.print("\t\t\tEnter Alphabet to check its vowel or not= ");

            	char ch=sc.next().charAt(0);


 

            switch(ch)
          {
           case 'a':
            {
            System.out.print("\t\t\t Its vowel ");
            break;
              }

           case 'i':
             {
           System.out.print("\t\t\t Its vowel " );
           break;
            }

          case 'e':
          {
         System.out.print("\t\t\t Its vowel ");
         break;
          }

           case 'o':
           {
           System.out.print("\t\t\t its vowel ");
                break;
               }

            case 'u':
             {
          System.out.print("\t\t\t its vowel" );
             break;
            }
           case 'A':
              {
              System.out.print("\t\t\t Its vowel" );
                break;
                   }
              case 'I':
                {

              System.out.print("\t\t\t Its vowel " );
                  break;
                   }
               case 'E':
                   {

              System.out.print("\t\t\t Its vowel" );
                    break;
                     }
                  case 'O':
                     {

               System.out.print("\t\t\t its vowel" );
                 break;
                    }

                case 'U':
                 {

                 System.out.print("\t\t\t its vowel ");
                  break;
                     }


                  default:
                   {
                  System.out.print("\t\t\t Its not vowel ");
                   break;
}
}
}
}

