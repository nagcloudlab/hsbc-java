package com.example.ex10;


// Non-static inner class
class Outer1{
    class Inner1{
        void m1(){
            System.out.println("Inner1 m1()");
        }
    }
}

// Static inner class
class Outer2{
    static class Inner2{
        void m2(){
            System.out.println("Inner2 m2()");
        }
    }
}


// Local inner class
class Outer3{
   void m(){
       class Inner3{
           void m3(){
               System.out.println("Inner3 m3()");
           }
       }
       Inner3 i3 = new Inner3();
       i3.m3();
   }
}


// Anonymous inner class
interface Foo{
    void m();
}

class Outer4{
    void m(){
        Foo foo=new Foo() {
            @Override
            public void m() {

            }
        };
    }
}


public class Ex3 {
    public static void main(String[] args) {

        Outer1.Inner1 oi1 = new Outer1().new Inner1();
        Outer2.Inner2 oi2 = new Outer2.Inner2();

    }
}
