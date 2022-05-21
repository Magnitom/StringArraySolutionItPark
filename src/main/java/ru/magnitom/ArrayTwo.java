package ru.magnitom;

import java.util.Scanner;

public class ArrayTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Double[] ArrayIn = new Double[3];
        for (int i = 0; i < ArrayIn.length; i++) {
            ArrayIn[i] = input.nextDouble();
        }
        double sumArr = 0, proizvArr = 1;
        for (double i : ArrayIn) {
            sumArr = sumArr + i;
            proizvArr = proizvArr * i;
        }
        System.out.println("Сумма массива = " + sumArr);
        System.out.println("Произведение членов массива =" + proizvArr);
        System.out.println("Среднее значение всех членов массива =" + sumArr/3);
    }
}
