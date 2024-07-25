package com.example.ex3;

public abstract class LivingThing {

    public void eat(){
        System.out.println("LivingThing eat");
    }

    public final void sleep(){
        System.out.println("LivingThing sleep");
    }

    public abstract void work();

}
