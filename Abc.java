import java.util.*;
public class Maxelement
{
public static void main(String x[])
{
Scanner sc=new Scanner(System.in);
int a[]=new int[5];
System.out.println("Enter the number");
for(int i=0;i<a.length;i++)
{
a[i]=sc.nextInt();
}
int max=a[0];
for(int i=0;i<a.length;i++)
{
if(a[i]>max)
{
max=a[i];
}
}
System.out.println("Max number is"+max);

int min=a[0];
for(int i=0;i<a.length;i++)
{
if(a[i]<min)
{
min=a[i];
}
}
System.out.println("Min number in array"+min);
}
}