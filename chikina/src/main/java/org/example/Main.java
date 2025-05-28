package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //System.out.println("Lera " + getMaxMinValue());
        //sortValues();
        getSimpleValues();
    }

//Заполните массив случайным числами и выведите максимальное, минимальное и среднее значение.
    private static Object getMaxMinValue() {
        Double arg[] = new Double[10];
        for (int i = 0; i < 10; i++) {
            arg[i] = Math.random();
        }
        double firstMax = 0;
        double firstMin = 0;
        System.out.println("Arrays: " + Arrays.toString(arg));
        for (int i = 0; i < 10; i++) {
            firstMax = arg[i];
            firstMin = arg[i];
            for (int j = 0; j < 9; j++) {
                double last = arg[j];
                if (last > firstMax) {
                    firstMax = last;
                }
                if (last < firstMin) {
                    firstMin = last;
                }
            }
        }
        System.out.println("max value: " + firstMax);
        System.out.println("min value: " + firstMin);
        return Arrays.toString(arg);
    }

    //метод сортировки пузырьком. Если 1-й элемент пары больше 2-го, элементы переставляются (выполняется обмен).
    private static void sortValues() {
        int arg[] = {6, 5, 8, 1, 4, 9};
        for (int i = 0; i < arg.length; i++) {
            int leftElement = arg[i];
            int next = i + 1;
            if (next < arg.length && leftElement > arg[next]) {
                arg[i] = arg[next];
                arg[next] = leftElement;
            }
        }
        System.out.println("new array " + Arrays.toString(arg));
    }

    //Напишите программу, которая выводит на консоль простые числа в промежутке от [2, 100].
    //Используйте для решения этой задачи оператор "%" (остаток от деления) и циклы.
    private static void getSimpleValues() {
        for (int i = 2; i <= 100; i++) {
            boolean isSimple = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isSimple = false;
                    break;
                }
            }
            if (isSimple) {
                System.out.println(i);
            }
        }
    }
}