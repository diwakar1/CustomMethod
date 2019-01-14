package com.examples.java.Utilities;

import java.util.Scanner;

public class InputHelper {
     public  String getInput(String prompt) {
        System.out.println(prompt);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
