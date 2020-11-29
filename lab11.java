import java .util.*;
 class demo
 {
   int fib(int n)
    {   
      if(n==1)
         return 1;
          else if(n==2)
             return 1;
            else
             return(fib(n-1)+fib(n-2));
         }
         }
    calss lab11
       {
         public static viod main(string args[])
         {
           scanner s=new scanner(system.in);
           system.out.println("nter n value ");
             int n=s.nexint();
             demo d=new demo();
               int rec=0;
              system.out.println("the reccersive fibbonaocci series is");
              system.out.println(rec);
               int i;
               for(i=1;i<n;i++)
               {
                 rec=d.fib(i);
                  system.out.println(rec);
                }
                  system.out.println(n+"the value of series is"+rec);
                  int a=1,b=1,c=0;
                   system.out.println("the non servies fibbonoci seres is");
                   system.out.println(c);
                   system.out.println(a);
                   system.out.println(b);
                   for(i=1; i<n-2 ;i++)
                   {
                     c=a+b;
                      system.out.println(c);
                        a=b;
                        b=c;
}
}
}