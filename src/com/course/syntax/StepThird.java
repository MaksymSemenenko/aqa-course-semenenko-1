package com.course.syntax;
import java.util.Scanner;
public class StepThird {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Task 1:");
        System.out.print("Enter int value: a = ");
        int a = scanner.nextInt();
        if (a == 0) {
            System.out.println("a = 0");
        } else if (a < 10) {
            System.out.println("a < 10");
        } else if (a > 0) {
            System.out.println("a > 10");
        } else {
            System.out.println("ERROR");
        }
        //Task2
        System.out.println("Task 2:");
        System.out.print("Enter double value: b = ");
        double b = scanner.nextDouble();
        if (b % 2 != 0) {
            System.out.println("Odd number ");
        } else {
            System.out.println("Parity number ");
        }
        //Task3
        System.out.println("Task 3:");
        System.out.print("Enter float value: c = ");
        float c = scanner.nextFloat();
        if ((c % 2 == 0 && c > 10) || c == 15) {
            System.out.println("First message");
        } else {
            System.out.println("Second message");
        }
    }
}
