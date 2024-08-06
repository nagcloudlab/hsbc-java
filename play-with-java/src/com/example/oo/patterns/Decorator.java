package com.example.oo.patterns;

/**
 *`* Created by NAG on 2018-07-21
 */

/*
    Decorator Pattern
    - Attach additional responsibilities to an object dynamically.

    real world example:
    - Suppose you have a car and you want to add some features to it
       like air conditioning, car stereo etc.
 */

// Component
// Interface for objects that can have responsibilities added to them dynamically.
interface Car {
    void assemble();
}

// Concrete Component
class BasicCar implements Car {
    @Override
    public void assemble() {
        System.out.print("Basic Car.");
    }
}

// Decorator
abstract class CarDecorator implements Car {
    protected Car car;

    public CarDecorator(Car car) {
        this.car = car;
    }

    @Override
    public void assemble() {
        this.car.assemble();
    }
}

// Concrete Decorator
class CarWithAirConditioning extends CarDecorator {
    public CarWithAirConditioning(Car car) {
        super(car);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.print(" Adding Air Conditioning.");
    }
}

// Concrete Decorator
class CarWithCarStereo extends CarDecorator {
    public CarWithCarStereo(Car car) {
        super(car);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.print(" Adding Car Stereo.");
    }
}

public class Decorator {

    public static void main(String[] args){

        Car basicCar = new BasicCar();
//        System.out.println(basicCar.i);

        basicCar.assemble();

        CarWithCarStereo carWithCarStereo = new CarWithCarStereo(basicCar);
        //carWithCarStereo.assemble();

        CarWithAirConditioning carWithCarStereoWithAirConditioning = new CarWithAirConditioning(carWithCarStereo);
        carWithCarStereoWithAirConditioning.assemble();




        //Java Api Example using Decorator Pattern
        //BufferedReader br = new BufferedReader(new FileReader("test.txt"));




    }

}
