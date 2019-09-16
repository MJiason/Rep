package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        byte a = 0, b = 0, m = 0, n = 0;
        float result = 0;
        final int C = 0;
        try {
            Scanner reader = new Scanner(System.in);
            System.out.print("Введіть нижню границю: ");
            a = reader.nextByte();
            System.out.print("\nВведіть верхню границю: ");
            n = reader.nextByte();
            System.out.print("\nВведіть нижню границю: ");
            b = reader.nextByte();
            System.out.print("\nВведіть верхню границю: ");
            m = reader.nextByte();
        } catch (Exception ex) {
            System.out.println("Невірно введені дані !!");
            System.exit(0);
        }
        if (a > n || b > m) {
            System.out.println("Невірно введені границі!");
            System.exit(0);

        }
        if (a <= -C && n >= -C) {
            System.out.println("Помилка ділення  на 0");
            System.exit(0);
        }
        for (byte i = a; i <= n; i++) {
            for (byte j = b; j <= m; j++) {
                result = result + (float) (i - j) / (i + C);
            }
        }
        System.out.println("результат: " + result);

        System.out.println("change to commit");
        System.out.println("change");
    }

}
