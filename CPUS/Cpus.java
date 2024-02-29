import java.util.Scanner;
class Cpu {
int price=3400;
class Processor {
int noofcores=4;
String manufacture="intel core";
void display ()
{
System.out.println("no of cores:"+noofcores);
System.out.println("manufacturer:"+manufacture);
}
}
void display()
{
Processor p=new Processor ();
p.display ();
System.out.println("price:"+price);
}
static class Ram{
int memory=8;
String manufacture="corps";
void display()
{
System.out.println("memory:"+memory);
System.out.println("manufacturer:"+manufacture);
}} }
class Cpus{
public static void main (String[]args){
Cpu c1=new Cpu();
c1.display();
Cpu.Ram r1=new Cpu.Ram();
r1.display();
}
}
	


