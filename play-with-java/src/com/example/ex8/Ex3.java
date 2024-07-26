package com.example.ex8;

// string methods

public class Ex3 {

    public static void main(String[] args) {

        String s1 = "abcdefghgfedcba";

        // length
        System.out.println(s1.length());
        // charAt
        System.out.println(s1.charAt(7));
        // substring
        System.out.println(s1.substring(2));
        System.out.println(s1.substring(2, 5));
        // indexOf
        System.out.println(s1.indexOf('c'));
        System.out.println(s1.indexOf('z'));
        System.out.println(s1.indexOf("cd"));
        System.out.println(s1.indexOf("cd", 3));
        System.out.println(s1.indexOf("cba"));
        // lastIndexOf
        System.out.println(s1.lastIndexOf('c'));
        System.out.println(s1.lastIndexOf('z'));
        System.out.println(s1.lastIndexOf("cd"));
        System.out.println(s1.lastIndexOf("cd", 3));
        System.out.println(s1.lastIndexOf("cba"));
        // startsWith
        System.out.println(s1.startsWith("abc"));
        System.out.println(s1.startsWith("def"));
        // endsWith
        System.out.println(s1.endsWith("abc"));
        System.out.println(s1.endsWith("def"));
        // contains
        System.out.println(s1.contains("abc"));
        System.out.println(s1.contains("def"));
        // equals
        System.out.println(s1.equals("abcdefghgfedcba"));
        System.out.println(s1.equals("abcdefghgfedcb"));
        // equalsIgnoreCase
        System.out.println(s1.equalsIgnoreCase("abcdefghgfedcba"));
        System.out.println(s1.equalsIgnoreCase("abcdefghgfedcb"));
        // compareTo
        String a = "Abc";
        String b = "abc";
        System.out.println(a.compareTo(b));
        System.out.println(a.compareToIgnoreCase(b));
        // toLowerCase
        System.out.println(s1.toLowerCase());
        // toUpperCase
        System.out.println(s1.toUpperCase());
        // trim
        String s2 = "  abc  ";
        System.out.println(s2.trim());
        // replace
        System.out.println(s1.replace('c', 'z'));
        System.out.println(s1.replace("cd", "xy"));
        // split
        String s3 = "abc,def,ghi";
        String[] s4 = s3.split(",");
        for (String s : s4) {
            System.out.println(s);
        }
        // join
        String s5 = String.join(",", s4);
        System.out.println(s5);
        // format
        String formattedString = String.format("%s %d %f", "abc", 123, 45.67);
        System.out.println(formattedString);
        // valueOf
        int i = 123;
        double d = 45.67;
        String s6 = String.valueOf(i);
        String s7 = String.valueOf(d);
        System.out.println(s6);
        System.out.println(s7);
        // String to primitive
        int i2 = Integer.parseInt(s6);

        // primitive to String
        String s8 = Integer.toString(i2);
        System.out.println(s8);

        String s = " ";
        System.out.println(s.isEmpty());
        System.out.println(s.isBlank());

        String s9 = "abc";
        System.out.println(s9.repeat(3));

        // strip
        String s10 = "  abc  ";
        System.out.println(s10.strip());

        // trim vs strip
        // strip removes leading and trailing white spaces
        // trim removes leading and trailing white spaces
        // strip removes all white spaces
        // trim removes only leading and trailing white spaces


    }

}
