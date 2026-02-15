package org.example.arrays;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> tasks = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("Введите цифру от 1 до 5");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Добавить задачу");
                    break;
                case 2:
                    System.out.println("Удалить задачу по индексу");
                    break;
                case 3:
                    System.out.println("Показать все задачи");
                    break;
                case 4:
                    System.out.println("Показать количество задач");
                    break;
                case 5:
                    System.out.println("выход");
                    break;
                default:
                    System.out.println("Нет такой задачи");
                    break;
            }


        }
    }
}
