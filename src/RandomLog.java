/**
 * Created by Dmytro on 19.04.2017.
 */
import java.util.Scanner;

class Domane {

    String domName;


    String  addLogin() {
        String login;

        char[] n = new char[3];

        for (int i = 0; i < n.length; i++) {

            n[i] = (char) Math.random();
        }

        String n1 = Character.toString(n[0]);
        String n2 = Character.toString(n[1]);
        String n3 = Character.toString(n[2]);

        return  login = n1+n2+n3;


    }

}

public class RandomLog {
    public static void main(String[] args) {

        Domane user = new Domane();

        Scanner sc = new Scanner(System.in);

        System.out.println("Choose email service to creat: ");

        String email = sc.nextLine();


        switch(email) {

            case "gmail":


                System.out.println("Your email is: " +user.addLogin()   + "." + email +'.' +"com");

                break;

            case "yandex":

                System.out.println("Your email is: " +user.addLogin() + "." + email+"." +"com");
                break;

        }




    }


}

