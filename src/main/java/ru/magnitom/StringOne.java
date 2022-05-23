package ru.magnitom;

import java.util.Scanner;

public class StringOne {
    public static void main(String[] args) {
        System.out.println("Дана строка длиной больше 5 символов. Вывести в консоль подстроку из первых 3 символов и последних 3 символов.");
        Scanner input = new Scanner(System.in);
        String stringInput = input.nextLine();
        System.out.println("Первые 3 символа - " + stringInput.substring(0, 3));
        System.out.println("Последние 3 символа - " + stringInput.substring(3, 6));
    }
}
