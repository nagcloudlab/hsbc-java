package com.example.mt;

class TeacherTask implements Runnable {
    @Override
    public void run() {
        System.out.println("Teacher teaching..");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Teacher finished teaching..");
    }
}

class StudentTask implements Runnable {
    @Override
    public void run() {
        System.out.println("Student learning..");
        System.out.println("Student has Q...");
        Thread teacherThread = new Thread(new TeacherTask());
        teacherThread.start();
        try {
            teacherThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Student finished learning..");
    }
}


public class ThreadJoinEx {
    public static void main(String[] args) {

        Thread studentThread = new Thread(new StudentTask());
        studentThread.start();

    }
}
