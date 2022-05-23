package ru.magnitom;

import java.util.Scanner;

public class ArrayFour {
    public static void main(String[] args) {
        System.out.println("Дан массив из 5 целых чисел. Вывести в консоль результат деления суммы элементов массива на их количество.");
        System.out.println("Ввыедите массив из 5 целвых чисел: ");
        Scanner input = new Scanner(System.in);
        Integer[] array = new Integer[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
        int sum = 0;
        for (int i :
                array) {
            sum = i + sum;
        }
        System.out.println(sum/ array.length);
    }
}
