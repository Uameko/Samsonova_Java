package org.example;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        int taskNumber = getTaskNumber();

        while (taskNumber != 0){
            switch (taskNumber) {
                case 1: {
                    firstTask();
                    break;
                }
                case 2: {
                    secondTask();
                    break;
                }
                case 3: {
                    thirdTask();
                    break;
                }
            }

            taskNumber = getTaskNumber();
        }
    }

    private static int getTaskNumber() throws IOException {
        System.out.print("Введите номер задания (1, 2 или 3). Введите 0 для выхода: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        return Integer.parseInt(reader.readLine());
    }

    private static void firstTask() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Введите первое число: ");
        int a = Integer.parseInt(reader.readLine());

        System.out.print("Введите второе число: ");
        int b = Integer.parseInt(reader.readLine());
        System.out.println("Введены числа: "+ a + " и " + b);

        int sum = a + b;
        int subtraction = a - b;
        int multiply = a * b;
        double division = (double)a / b;

        System.out.print("Сравнение введенных чисел: ");
        if (a > b) {
            System.out.println(a + " > " + b);
        } else if (a < b) {
            System.out.println(a + " < " + b);
        } else {
            System.out.println(a + " = " + b);
        }
        System.out.println("Сумма введенных чисел: " + sum);
        System.out.println("Разница введенных чисел: " + subtraction);
        System.out.println("Произведение введенных чисел: " + multiply);
        System.out.println("Деление введенных чисел: " + division);
    }

    private static void secondTask() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите первую строку: ");
        String first = reader.readLine();
        System.out.print("Введите вторую строку: ");
        String second = reader.readLine();

        if (first.equals(second)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");
        }
    }

    private static void thirdTask() {
        int[] myArray  = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Четные цифры в массиве от 1 до 10: ");

        for (int j : myArray) {
            if (j % 2 == 0) {
                System.out.println(j);
            }
        }
    }
}