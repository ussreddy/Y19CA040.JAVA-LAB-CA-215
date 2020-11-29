class lab21extendsthread
{
public void run()
{
system.out.println("thred is running");
}
public static voidbmain(string args[]);
{
lab21 ob1=new lab21();
lab21 ob2=new lab21();
thread t1=new thread(ob1);
therad t2=new therad(ob2);
system.out.println("t1="+t1.getstate());
system.out.println("t2=+t2.getstate());
t1.start();
system.out.println("t1="+t1.getstate());
system.out.println("t2=+t2.getstate());
t2.start();
system.out.println("t1="+t1.getstate());
system.out.println("t2=+t2.getstate());
}
}
