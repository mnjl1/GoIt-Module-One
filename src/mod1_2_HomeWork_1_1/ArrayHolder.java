package mod1_2_HomeWork_1_1;


import java.util.*;

public class ArrayHolder {
    int[] array;
    int arraySize;
    int numberToSearch;

    Scanner scanner = new Scanner(System.in);

        public ArrayHolder(int arraySize) {

            this.array = new int[arraySize];
            this.arraySize = arraySize;
        }


    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }


    public void fillArray(int arraySize) {

        int count = 0;

        while (count < array.length) {
            System.out.println("Enter next number:");
            try {
                array[count] = Integer.parseInt(scanner.next());

                count++;

            } catch (Exception e) {
                System.out.println("Not interger. Try again.");
            }


        }


    }

    // сортировка массива, вывод на печать

    public void sortArray() {
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

    }

    //метод поиска числа по значению

    public void searchArray() {
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

            for (int i = 0; i < arraySize; i++) {
                System.out.println("Searching...");
                if (numberToSearch == array[i]) {
                    System.out.println("Number is found: " + numberToSearch + " array index: " + i);
                } else System.out.println("Number is not found.");
            }




    }
}
