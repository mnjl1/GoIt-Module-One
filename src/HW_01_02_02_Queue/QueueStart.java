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
                            while (true) {
                                System.out.println(" Press for 1 input");
                                System.out.println("Press any latter to quit program.");
                                int choice3=0;
                                try {
                                    choice3 = scanner.nextInt();
                                }catch (Exception e) {
                                    collection.printMassive();
                                    System.exit(0);
                                }
                                switch (choice3) {
                                    case (1): {
                                        if (collection.massive.size() < 16) {
                                            collection.addElementToCollection();
                                        }
                                        if (collection.massive.size() == 16) {
                                            collection.massive.remove();
                                            collection.addElementToCollection();
                                        }
                                        collection.printMassive();
                                        break;
                                    }
                                    case (2): {
                                        break;
                                    }
                                    default:
                                        System.out.println("Choose between 1 or 2");
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
                    System.out.println("Enter collection size: ");
                    boolean correctSize = false;
                    while (!correctSize){
                        try {
                            newInt = Integer.parseInt(scanner.next());
                            correctSize = true;
                        }catch (Exception e){
                            System.out.println("Collection size is not correct. try again.");
                        }
                    }
                    while(true) {
                        System.out.println(" Press for 1 input");
                        System.out.println("Press any latter to quit program.");
                        int choice4 = 0;
                        try {
                            choice4 = scanner.nextInt();
                        } catch (Exception e) {
                            collection.printMassive();
                            collection.printMassive();
                            System.exit(0);
                        }
                        switch (choice4) {
                            case (1): {
                                if (collection.massive.size() < newInt) {
                                    collection.addElementToCollection();
                                }
                                if (collection.massive.size() == newInt) {
                                    collection.massive.poll();
                                    collection.addElementToCollection();
                                }
                            }
                            collection.printMassive();
                        }
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
