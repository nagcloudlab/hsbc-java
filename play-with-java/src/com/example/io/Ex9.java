package com.example.io;


// serialization

import com.example.io.model.Employee;
import com.example.io.model.TechEmployee;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Ex9 {

    public static void main(String[] args) {

        Employee emp = new TechEmployee("John Doe", 30, 50000, "Java");
        //System.out.println(emp);

        try {
            FileOutputStream fos = new FileOutputStream("employee.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(emp);
            oos.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
