package HW_01_02_02_Collection;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

/**
 * Created by Dmytro on 09.05.2017.
 */
 public class CollectionHolder {
    public ArrayList<Integer> massive;
    int intNumber;
    int index;

    public   CollectionHolder() {
        massive = new ArrayList<>();
    }
     Scanner scanner = new Scanner(System.in);

// method to enter any integer
    public void checkInput() {
        boolean isInteger = false;
        while (!isInteger) {
            try { intNumber = Integer.parseInt(scanner.next());
                isInteger = true;
            }catch (Exception e) {
                System.out.println("Not integer, try again.");
            }
        }
    }


//next element to collection
    public void addElement() {
            System.out.println("Enter next element to collection.");
            checkInput();
            int newElement;
            ListIterator<Integer> integerIterator=massive.listIterator();
            while(integerIterator.hasNext()){
                newElement = integerIterator.next() +intNumber;
                integerIterator.set(newElement);
            }
             massive.add(intNumber);
    }

    public void removeElement() {
        System.out.println("Enter index to remove element.");

        int index=0;
        boolean correctIndex = false;
        while(!correctIndex) {
            checkInput();
            if (intNumber < 0 || intNumber > massive.size()-1) {
                System.out.println("Index is incorrect.");
            } else {
                index = intNumber;
                correctIndex = true;
            }
        }
        int del = massive.get(index);
        ListIterator<Integer> integerListIterator = massive.listIterator();
        int newElement;
        while (integerListIterator.hasNext()) {
            newElement = integerListIterator.next() - del;
            integerListIterator.set(newElement);
        }
        massive.remove(index);
    }

    //check if collection contains element
    public void checkElement() {
        System.out.println("Enter integer to check if collection contains it.");
        checkInput();
        boolean result = massive.contains(intNumber);
       if (result) {
           System.out.println("Yes");
       }else System.out.println("No");
    }

    public void searchIndex() {
        System.out.println("Enter index to look at element.");
        checkInput();
        index = intNumber;
        System.out.println(massive.get(index));
    }

    public void findMaxValue() {
        int maxValue = 0;
        for (Integer n: massive) {
            if (n > maxValue) maxValue = n;
        }
        System.out.println("Max value is: " + maxValue);
    }

    public  void  findMinValue() {
        int minValue = 0;
        for (Integer n: massive) {
            if (minValue < n) minValue = n;
        }
        System.out.println("Min value is: " +minValue);
    }

    public void calcAverage() {
        int sum = 0;
        for (Integer n: massive
             ) {
            sum+=n;
        }
        int average = sum/massive.size();
        System.out.println("Average is: " + average);
    }

    public void exitApp() {
        System.out.println("Exiting...");
        System.exit(0);
    }
}
