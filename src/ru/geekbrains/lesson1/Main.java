package ru.geekbrains.lesson1;

public class Main {

    public static void main(String[] args) {
        byte byte1 = 1;
        short short1 = 10;
        int int1 = 50;
        long long1 = 100000L;
        float float1 = 12.22f;
        double double1 = 23.23;
        char char1 = '*';
        boolean boolean1 = true;

        System.out.println("Результат вычисления: " + expressionResult(32.2f, 10.3f, 49.3f, 5.33f));

        System.out.println(isSumBetween10And20(0, 11));

        int z = -3;
        isNumberPositiveOrNegative(-3);

        System.out.println(isNumber2PositiveOrNegative(25));

        String name = "Amanda";
        System.out.println("Привет " + name + "!");

        int year = 2021;
        isYearLeapOrUsual(2021);
    }

    public static float expressionResult (float a, float b, float c, float d) {
        return a * (b + (c / d));
    }

    public static boolean isSumBetween10And20 (int x, int y) {
        int sum = x + y;
        boolean res = sum >10 && sum <= 20;
        return res;
    }

    public static void isNumberPositiveOrNegative (int z) {
        if (z >= 0) {
            System.out.println("Введенное число " + z + " положительное.");
        }
        else {
            System.out.println("Введенное число " + z + " отрицательное.");
        }
    }

    public static boolean isNumber2PositiveOrNegative (int w) {
        if (w < 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void printName (String name) {
    }

    public static void isYearLeapOrUsual (int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Введенный год " + year + " является високосным");
        }
        else {
            System.out.println("Введенный год " + year + " не является високосным");
        }
    }
}
