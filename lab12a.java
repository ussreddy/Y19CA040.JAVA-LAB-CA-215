/*write a program to perform the following call by value*/
import java.util.scanner;
impotr java.io.*;
     class  callby value
        {
           void read(int x ,inty)
           {
             x=x+10;
             y=y+10;
            }
        }
     class lab12a
        {
       public static void main(string args[])
         {
            int x,y;
            scanner s=new scanner(system.in);
              x=s.nextInt();
              y=s.nextInt();
             system.out.println("befor the x and y values are"+x+","+y);
               call by vlaue c=new call by value();
                 c.read(x,y);
                system.out.println("after the x and y values are"+x+","+y);
}
}
        
