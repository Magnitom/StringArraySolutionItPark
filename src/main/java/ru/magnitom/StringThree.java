package ru.magnitom;

import java.util.Scanner;

public class StringThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String stringOne = input.nextLine();
        String stringTwo = input.nextLine();
        System.out.println(stringTwo.contains(stringOne));
    }
}