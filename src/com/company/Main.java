package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число:");
       int i = scanner.nextInt();
        System.out.println("Введите второе число:");
       int b = scanner.nextInt();
        scanner.close();
        System.out.println("Сумма:"+(i+b));
    }
}













