package com.day7;


public class Geeks
{
   public static void main(String arg[])
   {
       // creating the thread group
       ThreadGroup t = new ThreadGroup("parent thread group");

       NewThread t1 = new NewThread("one", t);
       System.out.println("Starting one");
       NewThread2 t2 = new NewThread2("two", t);
       System.out.println("Starting two");

       // checking the number of active thread
       System.out.println("number of active thread: "
               + t.activeCount());
   }
}
