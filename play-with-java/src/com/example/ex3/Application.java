package com.example.ex3;

public class Application {
    public static void main(String[] args) {

        //Employee employee=new Employee(1,"John",1000);

        Dev devEmployee = new Dev(
                1,
                "John",
                1000,
                "Java"
        );

        Ops opsEmployee = new Ops(
                2,
                "Jane",
                800,
                "Linux"
        );

        System.out.println(devEmployee.getId());
        System.out.println(devEmployee.getDevSkills());

        System.out.println(opsEmployee.getId());
        System.out.println(opsEmployee.getOpsSkills());

    }
}
