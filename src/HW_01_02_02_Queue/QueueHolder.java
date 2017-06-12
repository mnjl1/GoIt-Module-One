package HW_01_02_02_Queue;


import java.util.*;

public class QueueHolder {
    static Queue<Integer> massive;
    int newInteger;
    int choice;
    Scanner scanner = new Scanner(System.in);

    public QueueHolder() {
        massive = new LinkedList<>();
    }

    public void notIntegerMessage() {
        System.out.println("Not integer, try again.");
    }

    public void checkInput() {

        System.out.println("Enter integer.");
        choice=0;
        boolean isInteger = false;
        while (!isInteger) {
            try {
                newInteger = Integer.parseInt(scanner.next());
                choice = newInteger;
                isInteger = true;
            } catch (Exception e) {
                notIntegerMessage();
                System.out.println("checking");
                System.out.println("\n");
            }
        }
    }

    public void addElementToCollection() {
        System.out.println("Add element to collection.");
        checkInput();
        massive.add(newInteger);
    }

    public void printMassive() {
        Iterator iterator = massive.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println("\n");
    }

    public int makingCorrectChoice() {
        boolean correctChoice = false;


        while (!correctChoice) {
            try {
                choice = Integer.parseInt(scanner.next());
                correctChoice = true;
            } catch (Exception e) {
                System.out.println("Not integer!");

            }
        }
        return choice;
    }
}

