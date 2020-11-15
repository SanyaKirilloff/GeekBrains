package ru.geekbrains.lesson1;

public class Employee {
    private String fullname;
    private String position;
    private String email;
    private String phone;
    private float salary;
    private int age;

    public Employee(String fullname, String position, String email, String phone, float salary, int age) {
        this.fullname = fullname;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void info() {
        System.out.println("ФИО: " + fullname);
        System.out.println("Должность: " + position);
        System.out.println("Email: " + email);
        System.out.println("Телефон: " + phone);
        System.out.println("Зарплата: " + salary);
        System.out.println("Возраст: " + age);
    }
    public int getAge() {
        return age;
    }
}
