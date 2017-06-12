/**
 * Created by Dmytro on 19.04.2017.
 */
import java.util.Scanner;
import java.util.Random;

class Domain {

    String domName;
    int domNameLength;

    String addGmail() {

        return "@gmail.com";
    }

    String addYandex() {

        return "@yandex.ua";
    }


    String  addLogin() {



        int[] n = new int[3];


        for (int i = 0; i < n.length; i++) {

            n[i] = (int) (Math.random()*10);
        }

        String n1 = Integer.toString(n[0]);
        String n2 = Integer.toString(n[1]);
        String n3 = Integer.toString(n[2]);

        return  n1+n2+n3;


    }


/*
String addLogin() {
    Random r = new Random();

    char randomLetter = (char) (r.nextInt(26) +'a');

    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter your email loin length from 5 to 10: ");

    domNameLength = scanner.nextInt();



}
*/
}

public class RandomLog {
    public static void main(String[] args) {

        Domain user = new Domain();

        Scanner sc = new Scanner(System.in);

        System.out.println("Choose email service to creat: ");
        System.out.println("1. gmail");
        System.out.println("2. yandex");

        String choice = sc.nextLine();


        switch(choice) {

            case "1":


                System.out.println("Your email is: " +user.addLogin()   +user.addGmail() );

                break;

            case "2":

                System.out.println("Your email is: " +user.addLogin() +user.addYandex() );
                break;

        }




    }


}

