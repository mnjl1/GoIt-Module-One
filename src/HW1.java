
import java.util.Arrays;
import java.util.Scanner;


public class HW1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter massive length: ");

        int n = sc.nextInt();

        int[] massive  = new int[n];

        for (int i = 0; i < massive.length; i++) {

            System.out.println("Enter next massive element: ");
            massive[i] = sc.nextInt();

        }
        System.out.print("Your massive is: ");

        System.out.println(Arrays.toString(massive));

        System.out.println("Make your choice: ");
        System.out.println("1. Find number.");
        System.out.println("2. Sort massive.");

        int choice = sc.nextInt();

        switch (choice) {

            case 1:

                System.out.println("Enter massive number element from 0 to " + (n - 1));


                int number;


                do {
                    System.out.println("Enter correct number.");
                    number = sc.nextInt();

                } while (number < 0 || number > massive.length);


                System.out.println("Element is: " + massive[number]);


                break;


            case 2:


                System.out.println(Arrays.toString(massive));
                break;


        }


    }
}
