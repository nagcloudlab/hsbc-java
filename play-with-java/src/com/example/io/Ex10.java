package com.example.io;

import com.example.io.model.Employee;
import com.example.io.model.TechEmployee;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Ex10 {
    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("employee.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Object obj = ois.readObject();
            TechEmployee emp = (TechEmployee) obj;

            System.out.println(emp);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
