package com.lambton;

import java.text.DecimalFormat;

public class LambtonStringTools {
    public static void main(String[] args)
    {
        //STRING REVERSE
        String input = "LAMBTON";

        byte [] strAsByteArray = input.getBytes();
        byte [] result =
                new byte [strAsByteArray.length];

        for (int i = 0; i<strAsByteArray.length; i++)
            result[i] =
                    strAsByteArray[strAsByteArray.length-i-1];
        System.out.println(new String(result));


      //NAME
        String nameString="bushair";
        System.out.println(nameString.toUpperCase());
        nameString.

    }




    }


