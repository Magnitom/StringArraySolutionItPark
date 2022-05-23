package ru.magnitom;

import java.util.Scanner;

public class ArrayThree {
    public static void main(String[] args) {
        System.out.println("Дан массив из 5 символов. Сформировать из данного массива строку, начиная с конца и вывести её в консоль.");
        Scanner input = new Scanner(System.in);
        String[] ArrayInput = new String[5];
        System.out.println("Введите массив из 5 стрингов: ");
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
