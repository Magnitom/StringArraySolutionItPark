package ru.magnitom;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Integer[] ArrayIn = new Integer[5];
        for (int i = 0; i < ArrayIn.length; i++) {
            ArrayIn[i] = input.nextInt();
        }
        int tempFirst = ArrayIn[0];
        ArrayIn[0] = ArrayIn[4];
        ArrayIn[4] = tempFirst;
        System.out.println(Arrays.toString(ArrayIn));

    }
}
