package ru.geekbrains.lesson1;

import java.util.Calendar;
import java.util.Scanner;

public class MainApp {

    private static Object Year;

    public static void main(String[] args) {
    //Создать переменные всех пройденных типов данных и инициализировать их значения.
        byte a = 1;
        short b = 2;
        int c = 3;
        long d = 4L;
        float e = 5.1f;
        double f = 5.2;
        char g = 'c';
        boolean h = false;

        homeWork();
        between10and20();
        lessOrMoreThenZero();
        lessOrMoreThenZero2();
        helloName();
        year();

    }

    //Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат
    public static float homeWork() {
            float a, b, c, d, e;
            a = 1;
            b = 2;
            c = 3;
            d = 4;
            e = a * (b + (c / d));
            System.out.println(e);
            return e;
        }

    //Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах
    // от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
    public static boolean between10and20() {
        Scanner a = new Scanner(System.in);
        System.out.println("Введите первое целое число:");
        int number = a.nextInt();
        Scanner b = new Scanner(System.in);
        System.out.println("Введите второе целое число:");
        int number2 = b.nextInt();
        int c = number + number2;
        if (c >= 10 && c <= 20) {
            System.out.println("True");
            return true;
        }
            System.out.println("False");
            return false;
    }

    //Написать метод, которому в качестве параметра передается целое число, метод должен напечатать
    //в консоль, положительное ли число передали или отрицательное.
    public static void lessOrMoreThenZero() {
        Scanner a = new Scanner(System.in);
        System.out.println("Введите целое число:");
        int number = a.nextInt();

        if (number < 0) {
            System.out.println("Число отрицательное");
        }
        else {
            System.out.println("Число положительное");
            }
        }

    //Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть
    //true, если число отрицательное, и вернуть false если положительное.
    public static boolean lessOrMoreThenZero2() {
        Scanner a = new Scanner(System.in);
        System.out.println("Введите целое число:");
        int number = a.nextInt();

        if (number < 0) {
            System.out.println("Число отрицательное");
            return true;
        }
        else {
            System.out.println("Число положительное");
            return false;
        }
    }

    //Написать метод, которому в качестве параметра передается строка, обозначающая имя. 
    // Метод должен вывести в консоль сообщение «Привет, указанное_имя!».
    public static void helloName() {
        Scanner a = new Scanner(System.in);
        System.out.println("Введите Ваше Имя:");
        String n = a.next();
        System.out.println("Привет, " + n + "!");
    }
    //Написать метод, который определяет, является ли год високосным, и выводит сообщение в консоль
    public static void year() {
        int year = Calendar.getInstance().get(Calendar.YEAR);
        System.out.println(year);
        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            System.out.println("Год високосный");
        }
        else {
            System.out.println("Год обычный");
        }
    }
}

