package ru.magnitom;

import java.util.Scanner;

public class ArrayTwo {
    public static void main(String[] args) {
        System.out.println("Дан массив из 3 чисел с плавающей точкой. Вывести в консоль сумму, произведение и среднее этих чисел.");
        Scanner input = new Scanner(System.in);
        Double[] ArrayIn = new Double[3];
        System.out.println("Введите массив из 3 чисел с плаващей запятой: ");
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
