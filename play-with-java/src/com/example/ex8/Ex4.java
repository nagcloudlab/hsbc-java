package com.example.ex8;

public class Ex4 {

    public static void main(String[] args) {


        String ssnInput = "123-w5-6782";
        // validate ssn input, format: xxx-xx-xxxx, x is a digit

        // way-1 : using string methods

        boolean isValid = true;
        int len = ssnInput.length();
        if (len != 11) {
            isValid = false;
        } else {
            for (int i = 0; i < len; i++) {
                char ch = ssnInput.charAt(i);
                if (i == 3 || i == 6) {
                    if (ch != '-') {
                        isValid = false;
                        break;
                    }
                } else {
                    if ("0123456789".indexOf(ch) == -1) {
                        isValid = false;
                        break;
                    }
                }
            }
        }

        System.out.println("isValid: " + isValid);

        // way-2 : using regular expression
        isValid = ssnInput.matches("\\d{3}-\\d{2}-\\d{4}");
        System.out.println("isValid: " + isValid);


    }

}
