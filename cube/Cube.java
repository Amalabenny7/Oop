//to print the cube of number with given limit
import java.util.Scanner;
class Cube{
public static void main(String[] args)
{
System.out.print("enter the limit:");
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
for(int i=1;i<=num;i++)
{
System.out.println(i+":"+i*i*i);
}
}
}
