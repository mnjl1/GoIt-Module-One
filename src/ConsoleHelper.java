

import java.util.Scanner;

public class ConsoleHelper {



        ArrayHolder mass = new ArrayHolder();


        Scanner scanner = new Scanner(System.in);


        int size = scanner.nextInt();


        //создаем меню выбора действий над массивом

    public void menu() {

        System.out.println("Make your choice: ");
        System.out.println("1. Sort array.");
        System.out.println("2. Search number");

        boolean isInteger = false;
        int choice = 0;

        while (isInteger = false && choice < 1 || choice > 2) {
            try {
                choice = Integer.parseInt(scanner.next());
                isInteger = true;

            } catch (Exception e) {
                System.out.println("Wrong choice, try again.");
            }

        }

        switch (choice) {

            case 1: {

                mass.sortArray();
                System.out.println("Sorted array: " + mass);

            }

            case 2: {
                mass.searchArray();
            }

        }
    }

}

