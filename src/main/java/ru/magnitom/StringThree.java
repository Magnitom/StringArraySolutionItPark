package ru.magnitom;

import java.util.Scanner;

public class StringThree {
    public static void main(String[] args) {
        System.out.println("Даны 2 строки. В консоль вывести true, если первая строка является подстрокой второй строки, в противном случае вывести false.");
        Scanner input = new Scanner(System.in);
        String stringOne = input.nextLine();
        String stringTwo = input.nextLine();
        System.out.println(stringTwo.contains(stringOne));
    }
}