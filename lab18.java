package pack;
public class addition
{
private double d1,d2;
public addition(double a,double b)
{
d1=a;
d2=b;
}
public void sum()
{
system.out.println("sum="+d1+d2);
}
}
class lab18
{
public static void main(string args[])
{
pack.addition a=new pack.addition(10,15.5);
a.sum();
}
}
