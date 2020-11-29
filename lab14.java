/*write a program to  implent method overriding*/
  class A
    {
       public void dispaly()
       {
         system.out.println("hai");
         }
       }
        class B extend A
         {
           public void display()
             {
          system.out.println("hello");
            }
           }
           class lab14
             {
                public static void main(string args[])
                {
                  A ref;
                   A a=new A();
                   B b=new B(); 
                    ref=a;
                    ref.display();
                    ref=b;
                    ref.display();
                 }
      }  