/**
 * Created by Dmytro on 15.04.2017.
 */

import java.util.Scanner;
import java.util.Arrays;

public class HomeWork0102 {
    public static void main(String[] args) {
        int[] n = new int[5];

        Scanner sc = new Scanner(System.in);


        for(int i = 0; i<5; i++) {
            System.out.println("Enter number: " +(i+1));
            n[i] = sc.nextInt();

        }
        sc.close();

        System.out.println("Initial array: " +Arrays.toString(n));

        Arrays.sort(n);

        System.out.println("Sorted array: " +Arrays.toString(n));


    }
}
