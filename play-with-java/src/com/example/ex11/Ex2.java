package com.example.ex11;


// singleton pattern, e.g DeviceDriver

class DeviceDriver implements AutoCloseable {

    private static DeviceDriver instance = new DeviceDriver();

    private DeviceDriver() {
    }

    public static DeviceDriver getInstance() {
        return instance;
    }

    public void open() {
        System.out.println("DeviceDriver.open()");
    }

    public void use() {
        System.out.println("DeviceDriver.use()");
        boolean isDeviceReady = true;
        if (!isDeviceReady)
            throw new IllegalStateException("device not ready");
    }

    public void close() {
        System.out.println("DeviceDriver.close()");
    }
}


public class Ex2 {
    public static void main(String[] args) {

//        DeviceDriver driver = DeviceDriver.getInstance(); // resource object
//
//        try {
//            driver.open();
//            driver.use();
//            return;
//            //driver.close();
//        } catch (IllegalStateException e) {
//            System.out.println(e.getMessage());
//            //driver.close();
//        } finally {
//            // cleanup code
//            driver.close();
//        }


//        try {
//
//        } finally {
//
//        }

        // java 1.7 , try with resources

        try (DeviceDriver driver = DeviceDriver.getInstance()) {
            driver.open();
            driver.use();
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }


    }
}
