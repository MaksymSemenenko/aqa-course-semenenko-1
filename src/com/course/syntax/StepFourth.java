package com.course.syntax;
import java.math.BigInteger;
import java.util.Scanner;
public class StepFourth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Task1
        System.out.println("Task 1");
        System.out.print("Enter value a: ");
        int a = scanner.nextInt();
        if (a < 0) {
            System.out.println("Error! 'a' < 0!");
        } else if (a % 3 == 0) {
            System.out.println("The number multiple to 3");
        } else if (a % 2 == 0) {
            System.out.println("The number is even");
        }
        for (int i = 0; i <= a; i++) {
            if (a % 3 == 0) {
                break;
            }
            System.out.println(i);
        }
        //Task2
        System.out.println("Task 2");
        BigInteger factorial = BigInteger.valueOf(1);
        for (long j = 2; j <= a; j++) {
            factorial = factorial.multiply(BigInteger.valueOf(j));
        }
        System.out.println(factorial);
//        long factorial = 1;
//        for (int j = 1; j <= a; j++) {
//            factorial = factorial * j;
//        }
//        System.out.println("Factorial of " + a + " is " + factorial);
        //Task3
        System.out.println("Task 3");
        int divisor = 1;
        for (int k = 1; k < a; k++) {
            if (a % k == 0) {
                divisor = k;
            }
        }
        System.out.println(divisor);
        //Task4
        System.out.println("Task 4");
        System.out.print("Enter value: ");
        int age = scanner.nextInt();
        while (age <= 0 || age > 140) {
            System.out.println("Incorrect age value...");
            System.out.print("Please try again: ");
            age = scanner.nextInt();
        }
        System.out.println("Correct! Your age is " + age);
    }
}
