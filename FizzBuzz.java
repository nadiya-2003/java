import java.util.Scanner;

class FizzBuzz
{
public static void main(String args[])
{
int i;
for(i=1;i<=100;i++)
{
System.out.println(i);
}
Scanner s1=new Scanner(System.in);
int c=s1.nextInt();
if(c%3==0)
{
System.out.println("FIZZ");
}
else if(c%5==0)
{
System.out.println("BUZZ");
}
}
}