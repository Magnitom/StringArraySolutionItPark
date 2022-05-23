package ru.magnitom;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOne {
    public static void main(String[] args) {
        System.out.println("Дан массив целых чисел. Поменять местами первый и последний элемент и вывести полученный массив.");
        Scanner input = new Scanner(System.in);
        Integer[] ArrayIn = new Integer[5];
        System.out.println("Ввыедите массив из 5 чисел: ");
        for (int i = 0; i < ArrayIn.length; i++) {
            ArrayIn[i] = input.nextInt();
        }
        int tempFirst = ArrayIn[0];
        ArrayIn[0] = ArrayIn[4];
        ArrayIn[4] = tempFirst;
        System.out.println(Arrays.toString(ArrayIn));

    }
}
