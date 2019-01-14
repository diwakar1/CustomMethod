package com.examples.java.Utilities;

public class MathHelper {

    //public static final int ADD = 1001;
    //public static final int SUBTRACT =1002;

    private int total;


    public MathHelper() {
        System.out.println("constructor called");
        total =50;
    }

    InputHelper helper = new InputHelper();

    public MathHelper(int total) {
        this();
        this.total += total;
    }

    public int getTotal() {
        return total;
    }





    public int doMath(String prompt,Operation operation) throws NumberFormatException{
        String input = helper.getInput( prompt);
        int value = Integer.parseInt(input);

        switch (operation){
            case ADD:
                total += value;
                break;
            case SUBTRACT:
                total -= value;
                break;

        }


        return value;

    }

    public enum Operation {
        ADD,SUBTRACT
    }

}
