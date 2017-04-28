package mod1_2_HomeWork_1_1;


import java.util.*;

public class ArrayHolder {
   private int[] array;
    int arraySize;
    int numberToSearch;

    Scanner scanner = new Scanner(System.in);

        public ArrayHolder(int size) {

            this.array = new int[size];
            this.arraySize = size;
        }


    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public static void addSize() {

        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
    }


    public void fillArray(int arraySize) {

        int count = 0;

        while (count < arraySize) {
            System.out.println("Enter  number" +(count+1));
            try {
                array[count] = Integer.parseInt(scanner.next());

                count++;

            } catch (Exception e) {
                System.out.println("Not integer. Try again.");
            }


        }


    }

    // сортировка массива, вывод на печать

    public void sortArray() {
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

    }

    //метод поиска числа по значению

    public  void searchArray() {
        System.out.println("What number do you want to search?");

        Scanner scanner = new Scanner(System.in);

        int isInteger = 0;

        while (isInteger != 1) {

            try {

                numberToSearch = Integer.parseInt(scanner.next());
                isInteger = 1;


            } catch (Exception e) {
                 System.out.println("Not Integer, try again!");

            }
        }
        System.out.println("Searching..");
        System.out.println("Searching....");

        int s=0; //checking not found

            for (int i = 0; i < arraySize; i++) {



                if (numberToSearch == array[i]) {

                    System.out.println("Number " + numberToSearch +" is found: " +", " + " array index is: " + i);
                    s = 2;
                    break;

                } else s = -1;


            }

        if(s == -1) System.out.println("Number is not found.");





    }


    public void exitApp() {

        System.out.println("Getting out.....");
           System.exit(0);


    }
}
