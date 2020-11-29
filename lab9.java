/*write a program that disply area of different figures(rectagle,square and triangle) using the method overloading*/
import java.util.*;
 class lab9
   {
        void class (float a,float b)
        {
          float c=a*b;
          system.out.println("area of rectangle:"+c);
           }
         void area(float a)
            {
            float d=a*a;
              system.out.println("area of square:"+d);
              }
          void area (double x,double y)
               {
                   double e=0.5*x*y;
                  system.out.println("area of triangle:"+e);
                   }
                    public statics void main(string args[])
                      {
                        lab9 ob=new lab9();
                              ob.area(1,2);
                              ob.area(5);
                              ob.area(2.0,4.0);
           }
}