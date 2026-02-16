package org.example.arrays;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> tasks = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;
        boolean done = true;

        while (done) {
            System.out.println("1 - добавить задачу");
            System.out.println("2 - удалить задачу по индексу");
            System.out.println("3 - показать все задачи");
            System.out.println("4 - показать количество задач");
            System.out.println("5 - выход");
            System.out.println("Введите цифру от 1 до 5");

            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    String task = scanner.next();
                    tasks.add(task);
                    System.out.println("Задача добавлена");
                    break;
                case 2:
                    int index = scanner.nextInt();
                    if (index >= 0 && index <= tasks.size()) {
                        tasks.remove(index);
                        System.out.println("Задача удалена");
                    } else {
                        System.out.println("Такого индекса нет");
                    }
                    break;
                case 3:
                    System.out.println(tasks);
                    break;
                case 4:
                    System.out.println("Количество задач " + tasks.size());
                    break;
                case 5:
                    done = false;
                    System.out.println("выход");
                    break;
                default:
                    System.out.println("Нет такой задачи");

            }


        }
    }
}
