import java util.*;
final class box
{
final double length=4;
final double width=3;
Box(double l,double w)
{
length=l;
width=w;
}
final void vol()
{
double v=length*width;
system.out.println("the area is:"+v);
}
}
class room extends Box
{
double height;
Room(double p,double w,double h)
{
super(l,w);
height=h;
}
void vol()
{
double v=length*width*height;
system.out.println("the volume is:"+v);
}
}
class lab16
{
public ststic void main(string args[])
{
Room r1=new room(4,5,6)
r1.vo1();
}
}
