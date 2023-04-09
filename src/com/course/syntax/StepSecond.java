package com.course.syntax;

import java.util.Scanner;

public class StepSecond {
    public static void main(String[] args) {
        //StepSecond
        System.out.println("Step Second!");
        System.out.println("Task 1:");
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a:");
        int a = scanner.nextInt();
        System.out.print("enter b:");
        float b = scanner.nextFloat();
        System.out.print("enter c:");
        int c = scanner.nextInt();
        float p = a+b+c;
        System.out.println("Perimeter:" + p);
        float p2 = p/2;
        System.out.println("1/2 Perimeter:" + p2);
        float s = p2*(p2-a)*(p2-b)*(p2-c);
        float s2 = (float) Math.sqrt(s);
        System.out.println("Square of a triangle = " + s2);
        System.out.println("Task 2:");
        System.out.println("Initial:");
        int d = 3;
        System.out.println("d: " + d);
        int e = 7;
        System.out.println("e: " + e);
        System.out.println("--d:");
        int f = --d;
        System.out.println("f: " + f);
        System.out.println("d: " + d);
        System.out.println("d--:");
        int g = d--;
        System.out.println("g: " + g);
        System.out.println("d: " + d);
        System.out.println("++e:");
        int h = ++e;
        System.out.println("h: " + h);
        System.out.println("e: " + e);
        System.out.println("e++:");
        int k = e++;
        System.out.println("k: " + k);
        System.out.println("e: " + e);
    }
}
