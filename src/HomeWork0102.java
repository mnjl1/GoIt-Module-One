

import java.util.Scanner;
import java.util.Arrays;

public class HomeWork0102 {
    public static void main(String[] args) {
        int[] n = new int[5];

        Scanner sc = new Scanner(System.in);




        for(int i = 0; i<5; i++) {

            System.out.println("Enter next number: " +(i+1));


          int intNumber;


          do {

              if (sc.hasNextInt()) {
                  intNumber = sc.nextInt();
                  n[i] = intNumber;


              }

              else if(sc.hasNextDouble() ) {

                  double intdouble = sc.nextDouble();
                  System.out.println("Enter integer.");


              }
          else if (sc.hasNextLine()) {
                  String str = sc.nextLine();
                  System.out.println("Enter integer");

              }

          } while(true);






        }
        sc.close();

        System.out.println("Initial array: " +Arrays.toString(n));

        Arrays.sort(n);

        System.out.println("Sorted array: " +Arrays.toString(n));


    }
}
