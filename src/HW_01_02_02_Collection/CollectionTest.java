package HW_01_02_02_Collection;

import java.util.Scanner;

public class CollectionTest {
    public static void main(String[] args) {

        CollectionHolder testCollection = new CollectionHolder();
        while (true) {
            System.out.println("Make your choice: ");
            System.out.println("1.Add element to collection.");
            System.out.println("2.Remove element from collection.");
            System.out.println("3.Enter Integer to check if collection contains it.");
            System.out.println("4.Enter Index to find element.");
            System.out.println("5.Find Max value.");
            System.out.println("6.Find Min value.");
            System.out.println("7.Find Average value. ");
            System.out.println("8.Exit app.");
            System.out.println("9. Print collection.");

            Scanner scanner = new Scanner(System.in);
            int choice = 0;
            try{
                 choice = scanner.nextInt();
            }catch (Exception e) {
                System.out.println("Not an integer!");
            }

            switch (choice) {

                case (1): {
                    testCollection.addElement();
                    break;
                }
                case (2) : {
                    testCollection.removeElement();
                    break;
                }
                case (3) : {
                    testCollection.checkElement();
                    break;
                }
                case (4) : {
                    testCollection.searchIndex();
                    break;
                }
                case (5) : {
                    testCollection.findMaxValue();
                    break;
                }
                case (6) : {
                    testCollection.findMinValue();
                    break;
                }
                case (7) : {
                    testCollection.calcAverage();
                    break;
                }
                case (8) : {
                    testCollection.exitApp();
                    break;
                }
                case (9) : {
                    for (Integer x : testCollection.massive
                         ) {
                        System.out.println(x);
                    }
                    break;
                }
                default:
                    System.out.println(" Make correct choice.");
                    break;
            }
        }
    }
}
