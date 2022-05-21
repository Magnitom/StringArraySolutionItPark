package ru.magnitom;

import java.util.Scanner;

public class StringTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите число с нечётным количеством символов: ");
        String stringInput;
        while (true) {
            stringInput = input.nextLine();
            if (stringInput.length() % 2 == 0) {
                System.out.println("Ошибка, введено " + stringInput.length() + " символа, повторите ввод:");
            } else break;
        }
        System.out.println(stringInput.charAt(stringInput.length()/2));
    }
}
