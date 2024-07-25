package com.example.ex3;

public class LivingThingApplication {
    public static void main(String[] args) {

        Human human = new Human();
        Animal animal = new Animal();
        Robot robot = new Robot();

        God god = new God();


        System.out.println("-".repeat(10));
//        god.manageHuman(human);
        god.manageLivingThing(human);
        System.out.println("-".repeat(10));
//        god.manageAnimal(animal);
        god.manageLivingThing(animal);
        System.out.println("-".repeat(10));
        god.manageLivingThing(robot);
        System.out.println("-".repeat(10));

    }
}
