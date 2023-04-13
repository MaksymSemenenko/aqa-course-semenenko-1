package com.course.syntax;

import java.util.ArrayList;
import java.util.Arrays;

public class StepFifth {
    public static void main(String[] args) {
        //Task1
        System.out.println("Task 1");
        int[] array = {27, 32, 89};
        double average = 0;
        for(int i=0;i< array.length;i++) {
            average += array[i];
        }
        System.out.println("Average of array: " + average/array.length);
        //Task2
        System.out.println("Task 2");
        int[] array1 = {2,743,19};
        int[] array2 = {9,1,83,191};
        int arr1 = array1.length;
        int arr2 = array2.length;
        int[] merge = new int[arr1+arr2];
        for(int i=0;i< array1.length;i++) {
            merge[i] = array1[i];
        }
        for(int i=0;i< array2.length;i++) {
            merge[i+arr1] = array2[i];
        }
        System.out.println("Merged array: " + Arrays.toString(merge));
        //Task3
        System.out.println("Task 3");
        int maxNum = 0;
        for(int i = 0; i< merge.length;i++) {
            if(merge[i] > maxNum) {
                maxNum = merge[i];
            }
        }
        System.out.println("Maximum number of array: " + maxNum);
        //Task4
        System.out.println("Task 4");
        Arrays.sort(merge);
        System.out.println("Sorted array: " + Arrays.toString(merge));
        //Task5
        System.out.println("Task 5 - bubble sorting");
        int[] mas = {3,2,9,1,4};
        boolean isSorted = false;
        int buffer;
        while(!isSorted){
            isSorted = true;
            for (int i = 0; i < mas.length-1;i++) {
                if (mas[i]>mas[i+1]){
                    isSorted = false;
                    buffer = mas[i];
                    mas[i] = mas[i+1];
                    mas[i+1] = buffer;
                }
            }
        }
        System.out.println("Sorted array: " + Arrays.toString(mas));
    }
}
