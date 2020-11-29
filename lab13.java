/*write program to create player class and inherit three sub calss cricket-player,hockey-palyer,foot ball player.*/
import java .util.*;
  class player
  {
     int id;
     string name;
      player (int i,string n)
    {
      id=i;
      name =n;
      }
         void print()
        {
           system.out.println("player id is"+id);
           system.out.println("player name is "+name);
           }
       }
        class cricket extends player
         {
            int age;
           cricket(int i,string n,int a)
            {
              super (i,n);
               age=a;
             }
              void print();
             {
              super.print();
              system.out.println("cricket player age is"+age);
                }
              }
              class hocky extends player
               {
                 int weight;
                 hocky(int i,string n,int w)
                 {
                   super(i,n);
                   weight=w;
                   }
                    void print();
                    {
                      super.print();
                    system.out .println("hockey player weight is"+weight);
                    }
                 }
                class football extends player
                   {
                     int height;
                     football(int i,string n, int h)
                       {
                          super(i,n);
                          height=n;
                          }
                            void print();
                              {
                                 super.print();
                                system.out .println("football player height is"+height);
                                }
                             }
                           class lab13
                             {
                              public  static void main(strings args[])
                               {
                                cricket c=new cricket(1,"vasu",24);
                                        c.print();
                                 hockey h=new hockey(2,"siva",60);
                                         h.print();
                                 football f=new football(3,"sankar"6);
                                          f.print();
                        }
}