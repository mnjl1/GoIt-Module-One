package HW_01_02_02_Queue;


import java.util.*;

public class QueueHolder {
    public LinkedList<Integer> massive;
    int newInteger;

    public QueueHolder() {
        massive = new LinkedList<>();
    }



    public void checkInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integer.");
        boolean isInteger = false;
        while (!isInteger) {
            try {
                newInteger = Integer.parseInt(scanner.next());
                isInteger = true;
            }catch (Exception e) {
                System.out.println("Not integer, try again.");
                System.out.println("/n");
            }
        }
    }

    public  void addElementToCollection() {
        System.out.println("Add element to collection.");
        checkInput();
        massive.add(newInteger);

    }

    public void printMassive() {
        Iterator iterator = massive.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
        System.out.println("\n");
    }

    @Override
    public String toString() {
        return "QueueHolder{" +
                "massive=" + massive +
                '}';
    }
}
