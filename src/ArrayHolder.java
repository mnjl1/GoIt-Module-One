import java.util.*;

public class ArrayHolder {
    private int[] array;
    int arraySize;
    int numberToSearch;
    Scanner scanner = new Scanner(System.in);
    /*
        public ArrayHolder(int size) {

            this.array = new int[size];
        }
        */
    public void fillArray(int arraySize) {

            int count =0;

            while(count < array.length)
            try{ array[count] = Integer.parseInt(scanner.next());
                count++;

            }catch (Exception e) {
                System.out.println("Not interger. Try again.");
            }


    }


    // сортировка массива
    public void sortArray() {
        Arrays.sort(array);
    }

    //метод поиска числа по значению

    public void searchArray() {
        System.out.println("What number do you want to search?");

        Scanner scanner = new Scanner(System.in);

        boolean isInteger = false;

        while (isInteger = false) {
            try {

                numberToSearch = Integer.parseInt(scanner.next());
                isInteger = true;

            } catch (Exception e) {
                System.out.println("Not Integer, try again!");

            }

            for (int i = 0; i < arraySize; i++) {
                System.out.println("Searching...");
                if (numberToSearch == array[i]) {
                    System.out.println("Number is found: " + numberToSearch + " array index: " + i);
                } else System.out.println("Number is not found.");
            }


        }

    }
}
