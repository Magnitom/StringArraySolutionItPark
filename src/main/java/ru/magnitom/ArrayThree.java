package ru.magnitom;

import java.util.Scanner;

public class ArrayThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] ArrayInput = new String[5];
        for (int i = 0; i < ArrayInput.length; i++) {
            ArrayInput[i] = input.nextLine();
        }
        String stringSolution = ArrayInput[4];
        for (int i = 3; i >= 0; i--) {
            stringSolution = stringSolution + ArrayInput[i];
        }
        System.out.println(stringSolution);
    }
}
