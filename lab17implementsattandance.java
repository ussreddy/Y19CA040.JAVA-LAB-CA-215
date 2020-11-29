import java.util.*;
interface student
{
void name(int no,string name,int age);
}
interface department
{
void course(string course);
}
interface attandance extends student,department
{
void attand(int attandance);
}
class lab17 implements attandance
{
public void name(int no,string name,int age);
{
system.out.println("1001 no:"+no);
system.out.println("student name:"+name);
system.out.println("student age:"+age);
}
public void course(string course)
{
system.out.println("student course:"+course);
}
public void attand(int attandance)
{
system.out.println("attandance");
if(attandance>=75)
system.out.println("he is not eligible for exam");
}
public static void main(string args[])
{
lab 17 e=new lab17();
e.name(84,"vasu",23);
e.course("mca");
e.attand(80);
lab 17 e1=new lab 17();
e1.name=(1,"teja",21);
e1.course("mca");
e1.attand(60);
}
}
