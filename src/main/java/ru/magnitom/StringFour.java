package ru.magnitom;

import java.util.Scanner;

public class StringFour {
    public static void main(String[] args) {
        System.out.println("Дана строка и символ. В консоль вывести индекс строки, на котором находится данный символ.");
        Scanner input = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String stringInput = input.nextLine();
        System.out.println("Введите искомый символ: ");
        String charInput = input.nextLine();
        System.out.println(stringInput.indexOf(charInput));
    }
}