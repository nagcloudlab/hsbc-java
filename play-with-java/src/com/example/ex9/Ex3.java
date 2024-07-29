package com.example.ex9;

// interface with private method

interface Logger {
    private void log(String message) {
        System.out.println("Logging: " + message);
    }
    default void logInfo(String message) {
        log("INFO: " + message);
    }
    default void logError(String message) {
        log("ERROR: " + message);
    }
}

class FileLogger implements Logger {
    // This class must implement the default methods of the interface
}

public class Ex3 {

    public static void main(String[] args) {
        FileLogger logger = new FileLogger();
        logger.logInfo("This is an information message");
        logger.logError("This is an error message");
    }
}
