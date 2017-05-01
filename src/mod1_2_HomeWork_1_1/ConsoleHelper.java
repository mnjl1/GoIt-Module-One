package mod1_2_HomeWork_1_1;

import java.util.*;

public class ConsoleHelper {


    Scanner scanner = new Scanner(System.in);

    //создаем меню выбора действий над массивом



    public void menu() {

        System.out.println("Enter array size");
        int size;
        size = scanner.nextInt();

        ArrayHolder mass = new ArrayHolder(size);

        mass.fillArray(size);

        while (true) {

            System.out.println("Make your choice: ");
            System.out.println("1. Sort array.");
            System.out.println("2. Search number");
            System.out.println("3. Exit program. ");


            int choice = 0;



            while (choice ==0) {


                try {
                    choice = Integer.parseInt(scanner.next());

                } catch (Exception e) {
                    System.out.println("Wrong choice, try again.");
                }

            }


            switch (choice) {

                case 1:

                    mass.sortArray();
                    break;


                case 2:
                    mass.searchArray();
                    break;

                case 3:
                    mass.exitApp();
                    break;


                default:
                    //System.out.println("Make your choice!");

            }

        }

    }


}

