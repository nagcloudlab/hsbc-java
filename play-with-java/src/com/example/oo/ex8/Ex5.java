package com.example.oo.ex8;

import java.util.Map;

public class Ex5 {
    public static void main(String[] args) {

        String[] csvReport = {
                "Name, Dept,Salary",
                "John, HR, 1000",
                "Jane, IT, 2000",
                "Jack, IT, 1500",
                "Jill, HR, 900"
        };


        // calculate total salary for each department

        //way-1: department known in advance

        int hrTotal = 0;
        int itTotal = 0;

        for (int i = 1; i < csvReport.length; i++) {
            String[] fields = csvReport[i].split(",");
            if (fields[1].trim().equals("HR")) {
                hrTotal += Integer.parseInt(fields[2].trim());
            } else if (fields[1].trim().equals("IT")) {
                itTotal += Integer.parseInt(fields[2].trim());
            }
        }

        System.out.println("HR total: " + hrTotal);
        System.out.println("IT total: " + itTotal);

        // Way-2: What if we have more departments?
        // Solution: use a map to store total salary for each department

        Map<String, Integer> deptTotal = new java.util.HashMap<>();
        for (int i = 1; i < csvReport.length; i++) {
            String[] fields = csvReport[i].split(",");
            String dept = fields[1].trim();
            int salary = Integer.parseInt(fields[2].trim());
            if (deptTotal.containsKey(dept)) {
                deptTotal.put(dept, deptTotal.get(dept) + salary);
            } else {
                deptTotal.put(dept, salary);
            }
        }

        for (Map.Entry<String, Integer> entry : deptTotal.entrySet()) {
            System.out.println(entry.getKey() + " total: " + entry.getValue());
        }


        // Way-3: Without using map

        int[] deptTotal2 = new int[100];
        for (int i = 1; i < csvReport.length; i++) {
            String[] fields = csvReport[i].split(",");
            int deptIndex = -1;
            switch (fields[1].trim()) {
                case "HR":
                    deptIndex = 0;
                    break;
                case "IT":
                    deptIndex = 1;
                    break;
                // add more cases for other departments
            }
            if (deptIndex != -1) {
                deptTotal2[deptIndex] += Integer.parseInt(fields[2].trim());
            }
        }


    }
}
