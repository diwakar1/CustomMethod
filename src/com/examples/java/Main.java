package com.examples.java;

import com.examples.java.Utilities.MathHelper;

import static com.examples.java.Utilities.MathHelper.Operation.*;


public class Main {

    public static void main(String[] args) {

        /*InputHelper helper = new InputHelper();
        String input = helper.getInput("Enter a value 1 : ");
        System.out.println("You entered  value 1: "+ input);
        input = helper.getInput("Enter a value 2 : ");
        System.out.println("You entered value 2: "+ input);
*/
        MathHelper helper = new MathHelper(100);

        try {
            while(true) {
                int input = helper.doMath("Enter a number: ", ADD);
                int total = helper.getTotal();
                String message = String.format(
                        "Entered : %d, total = %d", input, total);
                System.out.println(message);
            }
        } catch (NumberFormatException e) {
            System.out.println("done");
        }


    }




}
