package com.example.ex10;

class Outer {

    static int staticVar = 10;
    int instanceVar = 20;

    static void staMethod() {
        System.out.println(staticVar);
        System.out.println(Inner.innerStaticVar);
    }

    void insMethod() {
        System.out.println(staticVar);
        System.out.println(instanceVar);
        Inner inner = new Inner();
        System.out.println(Inner.innerStaticVar);
    }

    private /*static*/ class Inner {
        static int innerStaticVar = 30;
        int innerInstanceVar = 40;

        static void innerStaMethod() {
            System.out.println(staticVar);
            System.out.println(innerStaticVar);
        }

        void innerInsMethod() {
            System.out.println(staticVar);
            //System.out.println(instanceVar);
            System.out.println(innerStaticVar);
            System.out.println(innerInstanceVar);
        }
    }

}

public class Ex1 {
    public static void main(String[] args) {

        Outer outer = new Outer();
        outer.insMethod();

        int localVar=12; // local variable

        class Local{
            static int staticVar = 60;
            int insVar = 50;
            static void staticMethod(){
                //System.out.println(insVar);
                System.out.println(staticVar);
            }
            void insMethod(){
                System.out.println(insVar);
                System.out.println(staticVar);
                System.out.println(localVar); // effectively final
            }
        }

        Local local = new Local();
        local.insMethod();


    }
}
