import java.util.*;

class Gradesub
{

public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);

System.out.print("\t\t\tEnter marks of Physics= ");
int S1 = sc.nextInt();

System.out.print("\t\t\tEnter marks of Chemistry= ");
int S2 = sc.nextInt();

System.out.print("\t\t\tEnter marks of Biology= ");
int S3 = sc.nextInt();

System.out.print("\t\t\tEnter marks of Mathematics= ");
int S4 = sc.nextInt();

System.out.print("\t\t\tEnter marks of Computer= ");
int S5 = sc.nextInt();
System.out.print("\t\t\t************************ ");
float result = (S1+S2+S3+S4+S5)*500/100;
System.out.println("\n\t\t\tResult = "+result);
System.out.print("\t\t\t************************ ");

if(result>=90){System.out.println("\n\t\t\tGrade A");}
else if(result>=80){System.out.println("\n\t\t\tGrade B");}
else if(result>=70){System.out.println("\n\t\t\tGrade C");}
else if(result>=60){System.out.println("\n\t\t\tGrade D");}
else if(result>=40){System.out.println("\n\t\t\tGrade E");}
else if(result<=40){System.out.println("\n\t\t\tGrade F");}
}
}