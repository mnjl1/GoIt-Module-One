package mod1_2_HomeWork_1_1;

import java.util.Scanner;

public class ConsoleHelper {

    Scanner scanner = new Scanner(System.in);

        int arraySize = scanner.nextInt();

        ArrayHolder mass = new ArrayHolder(arraySize);





        //создаем меню выбора действий над массивом

    public void menu() {

        mass.fillArray(arraySize);




        System.out.println("Make your choice: ");
        System.out.println("1. Sort array.");
        System.out.println("2. Search number");

        int choice = 0;

        while (choice < 1 || choice > 2) {
            try {
                choice = Integer.parseInt(scanner.next());

            } catch (Exception e) {
                System.out.println("Wrong choice, try again.");
            }

        }

        switch (choice) {

            case 1:

                mass.sortArray();
                System.out.println("Sorted array: " + mass);
                break;



            case 2:
                mass.searchArray();
                break;


            default:
                System.out.println("Make your choice!");

        }
    }

}

