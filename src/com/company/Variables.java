package com.company;

public class Variables {

    public String variables(){
        String string = "Kinds of variables";
        byte number = 1; // Size = 8 -> from -128 to 127
        short number2 = 2; // Size = 16 -> from -32,768 to 32,767
        int number3 = 3; // Size = 32 -> from -2' to 2'
        long number4 = 4; // Size = 64 -> from -9' to 9'

        float number5 = 5.153f; // IMPORTANT - write "f" at the end of te number
        // Size = 32
        double number6 = 6.1756; // Size 64

        //convert
        int number7 = (int) 33.84;

        char character = 'a';
        char character1 = '2';
        String hello = "Hello";

        boolean decision = true;
        boolean decision2 = false;

        // int num = null;  isn't correct
        Integer num = null;
        String cad = null;

        final int num1 = 10;
        // Constant, u can't not change it

        return string;
    }


}
