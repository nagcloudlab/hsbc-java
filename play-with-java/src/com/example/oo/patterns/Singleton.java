package com.example.oo.patterns;

// singleton pattern

// why singleton?
// 1. To ensure that a class has only one instance
// 2. To provide a global point of access to the object
// 3. To provide a way to access the object without instantiating it

class DeviceDriver {
    private static DeviceDriver instance = null;
    private DeviceDriver() {
        // Initialization
    }
    public static DeviceDriver getInstance() {
        if (instance == null) {
            instance = new DeviceDriver();
        }
        return instance;
    }

    public void open() {
        System.out.println("DeviceDriver open");
    }

    public void close() {
        System.out.println("DeviceDriver close");
    }
}


public class Singleton {
    public static void main(String[] args) {

        // DeviceDriver driver = new DeviceDriver(); // Error: The constructor DeviceDriver() is not visible
        // ----- module-1 -----
        DeviceDriver driver = DeviceDriver.getInstance();
        driver.open();


        // ----- module-2 -----
        DeviceDriver driver2 = DeviceDriver.getInstance();
        driver2.close();

    }
}
