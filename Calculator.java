
import java.util.Scanner;
class Calculator
{
public static void main(String args[])
{
Scanner s1=new Scanner(System.in);
int a=s1.nextInt();
int b=s1.nextInt();
int c=s1.nextInt();
switch(c)
{
case 1:
System.out.println("Addtion");
System.out.println(a+b);
break;

case 2:
System.out.println("Subtarction");
System.out.println(a-b);
break;

case 3:
System.out.println("Multiplication");
System.out.println(a*b);
break;

case 4:
System.out.println("Division");
System.out.println(a/b);
break;

default:
System.out.println("Invalid");
}
}
}