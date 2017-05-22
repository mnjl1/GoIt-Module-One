package HW_01_02_02_Queue;


import java.util.*;

public class QueueStart {
    public static void main(String[] args) {

        QueueHolder collection = new QueueHolder();
        int newInt = 0;


        while (true) {
            System.out.println("Make your choice:");
            System.out.println("1. Collection with 16 capacity.");
            System.out.println("2. Collection with any capacity.");
            System.out.println("3. Exit.");
            Scanner scanner = new Scanner(System.in);
            int choice = 0;
            boolean correctChoice = false;

            while (!correctChoice) {
                try {
                    choice = Integer.parseInt(scanner.next());
                    correctChoice = true;
                } catch (Exception e) {
                    System.out.println("Not integer!");
                }

            }

            switch (choice) {

                case (1): {
                    System.out.println("1. Add element.");
                    System.out.println("2. Back to menu.");
                    int choice1 = 0;
                    boolean correctChoice1 = false;
                    while (!correctChoice1) {
                        try {
                            choice1 = Integer.parseInt(scanner.next());
                            correctChoice1 =true;
                        } catch (Exception e) {
                            System.out.println("Not integer!");
                        }

                    }

                    switch (choice1) {

                        case (1): {

                            while(true) {
                                if (collection.massive.size() < 16) {
                                    collection.addElementToCollection();

                                }

                                if (collection.massive.size() == 16) {
                                    collection.massive.remove();
                                    collection.addElementToCollection();

                                }

                                collection.printMassive();

                            }

                        }

                        case (2): {

                            break;
                        }

                    }
                    break;
                }

                case (2): {
                    System.out.println("Creating a collection with any capacity.");
                    System.out.println("Enter collection size");

                    newInt = scanner.nextInt();
                    while(true) {
                        if (collection.massive.size() < newInt) {
                            collection.addElementToCollection();
                        }

                        if (collection.massive.size() == newInt) {
                            collection.massive.poll();
                            collection.addElementToCollection();
                        }

                        collection.printMassive();


                    }
                }

                case (3) : {
                    System.exit(0);
                    break;
                }
                default:
                    System.out.println("Not correct choice.");
                    break;
            }


        }
    }
}
