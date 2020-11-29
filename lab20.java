import java.util.scanner;
class addnumber exception
{
addnumber exception()
{
super("add number exception");
}
addnumber exception(string msg)
{
super(msg);
}
}
class lab20
{
pulbic static void main(string[]args)
{
int num;
scanner s=new scanner(system.in);
system.out.println("\n enter any number:");
num=Integer.ParseInt(s.nextline());
try
{
if(num%2!=0)
throw(new addnumber exception());
else
system.out.println("\n"+num+"is an even number");
}
catch(addnumber exception ex)
{
system.out.println("/n" error:"+ex.get message());
}
system.out.println("/n End of program");
}
}
