

import java.util.*;
import java.util.Scanner;
import java.util.Arrays;

public class HomeWork0102 {
    public static void main(String[] args) {
        int[] n = new int[5];

        Scanner sc = new Scanner(System.in);

        int count=0;

        while(count < n.length){

            System.out.println("Enter number " +(count+1));

            try{


                n[count] = Integer.parseInt(sc.next());

                count++;

            }
            catch(Exception e) {
                System.out.println("Wrong number, try again.");

            }

        }





        sc.close();

        System.out.println("Initial array: " +Arrays.toString(n));

        Arrays.sort(n);

        System.out.println("Sorted array: " +Arrays.toString(n));


    }
}
