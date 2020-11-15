package ru.geekbrains.lesson1;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] =
                new Employee(
                        "Ivanov Ivan Ivanovich",
                        "Manager",
                        "III@mail.ru",
                        "8-999-111-11-11",
                        35000,
                        35);

        employees[1] =
                new Employee(
                        "Pavlov Pavel Pavlovich",
                        "CEO",
                        "PPP@mail.ru",
                        "8-999-222-22-22",
                        350000,
                        45);

        employees[2] =
                new Employee(
                        "Petrov Petr Petrovich",
                        "CTO",
                        "PetrovPP@mail.ru",
                        "8-999-333-33-33",
                        300000,
                        36);

        employees[3] =
                new Employee(
                        "Sidorov Sidor Sidorovich",
                        "CFO",
                        "SSS@mail.ru",
                        "8-999-444-44-44",
                        320000,
                        34);

        employees[4] =
                new Employee(
                       "Fedorov Fedor Fedorovich",
                       "Engineer",
                        "FFF@mail.ru",
                        "8-999-555-55-55",
                        200000,
                        38);

        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getAge() > 40) {
                employees[i].info();
            }
        }
    }
}