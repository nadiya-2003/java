import java.util.Scanner;
class JaggedArray3
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter no .of Organisations:");
int m=sc.nextInt();
System.out.println("Enter no .of companies:");
int n=sc.nextInt();
String arr[][][]=new String[m][n][];
for(int i=0;i<arr.length;i++)
{
for(int j=0;j<arr[i].length;j++)
{
System.out.println("Enter the number of employee in an Organiztion no:"+(i+1)+"company no:"+(j+1));
   arr[i][j]=new String[sc.nextInt()];
}
}
//storing
for(int i=0;i<arr.length;i++)
{
System.out.println("inside Organisation no:"+(i+1));
for(int j=0;j<arr[i].length;j++)
{
System.out.println("inside company  no:"+(j+1));
for(int k=0;k<arr[i][j].length;k++)
{
System.out.println("enter the name of employee no:"+(k+1));
arr[i][j][k]=sc.next();
}
}
}
//retrieving
for(int i=0;i<arr.length;i++)
{
for(int j=0;j<arr[i].length;j++)
{
for(int k=0;k<arr[i][j].length;k++)
{
System.out.println("in organisation:"+(i+1)+"  in company:"+(j+1)+" the name of the employee is:"+ arr[i][j][k]);
}
}
}
}
}

