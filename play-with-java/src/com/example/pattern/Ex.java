package com.example.pattern;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

interface DoorListener {
    void on();

    void off();
}

class Light implements DoorListener {
    public void on() {
        System.out.println("Light is on");
    }

    public void off() {
        System.out.println("Light is off");
    }
}

class Fan implements DoorListener {
    public void on() {
        System.out.println("Fan is on");
    }

    public void off() {
        System.out.println("Fan is off");
    }
}

class Alarm implements DoorListener {
    public void on() {
        System.out.println("Alarm is on");
    }

    public void off() {
        System.out.println("Alarm is off");
    }
}

class Door {

    private ArrayList<DoorListener> listeners = new ArrayList<>();

    public void addListener(DoorListener listener) {
        listeners.add(listener);
    }

    public void removeListener(DoorListener listener) {
        listeners.remove(listener);
    }

    public void open() {
        System.out.println("Door is open");
        for (DoorListener listener : listeners) {
            listener.on();
        }
    }

    public void close() {
        System.out.println("Door is closed");
        for (DoorListener listener : listeners) {
            listener.off();
        }
    }
}


// pattern : Observer/Listener pattern

public class Ex {
    public static void main(String[] args) throws InterruptedException {


        Door door = new Door();

        Light light = new Light();
        Fan fan = new Fan();
        Alarm alarm = new Alarm();

        door.addListener(light);
        door.addListener(fan);
        door.addListener(alarm);

        TimeUnit.SECONDS.sleep(5);
        door.open();
        TimeUnit.SECONDS.sleep(5);
        door.close();

    }
}
