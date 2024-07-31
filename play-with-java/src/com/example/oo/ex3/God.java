package com.example.oo.ex3;

// Open/Closed Principle
public class God {

//    public void manageHuman(Human human) {
//        human.eat();
//        human.sleep();
//        human.study();
//        human.work();
//    }
//
//    public void manageAnimal(Animal animal) {
//        animal.eat();
//        animal.sleep();
//        animal.work();
//    }

    public void manageLivingThing(LivingThing livingThing) {
        livingThing.eat();
        livingThing.sleep();
        if(livingThing instanceof Human) {
            Human human = (Human) livingThing;
            human.study();
        }
        livingThing.work();
    }

}
