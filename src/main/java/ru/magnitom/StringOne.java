package ru.magnitom;

import java.util.Scanner;

public class StringOne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String stringInput = input.nextLine();
        System.out.println("Первые 3 символа - " + stringInput.substring(0, 3));
        System.out.println("Последние 3 символа - " + stringInput.substring(3, 6));
    }
}
