/*write a program to perform the following call by refence*/
import java.util.scanner;
impotr java.io.*;
  class cbr
   { 
      int a,b;
       void read(cbr())
         {
            c.a=c.a+10;
            c.b=c.b+10;
            }
     }
    class lab12b
          { 
            public static void main(string args[])
             {
                cbr.c=new cbr();
                   scanner s=new scanner(system.in);
                  c.a=s.nexInt();
                  c.b=s.nexInt();
                   system.out.println("befor the a and b values are"+c.a+","+c.b);
                        c.read(c);
                    
                   system.out.println("after the a and b values are"+c.a+","+c.b);
}
}