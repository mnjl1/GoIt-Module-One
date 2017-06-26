package HW_01_02_02_Queue;


import java.util.*;

public class QueueStart {
    public static void validateCustomException(int newInt) throws WrongCollectionCapacity{
        if (newInt <0) {
            throw new  WrongCollectionCapacity("Integer must be > 0");
        }

    }
    public static void main(String[] args) {

        QueueHolder collection = new QueueHolder();
        int newInt = 0;

        while (true) {
            System.out.println("Make your choice:");
            System.out.println("1. Collection with 16 capacity.");
            System.out.println("2. Collection with any capacity.");
            System.out.println("3. Fill queue with Random method.");
            System.out.println("4. Exit.");

            Scanner scanner = new Scanner(System.in);

            int choice=collection.makingCorrectChoice();


            switch (choice) {
                case (1): {
                    System.out.println("1. Add element.");
                    System.out.println("2. Back to menu.");

                    choice = collection.makingCorrectChoice();

                    switch (choice) {
                        case (1): {
                            while (true) {
                                System.out.println("Press 1 for input");
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

                                        ThreadForQueue t1 = new ThreadForQueue("one");
                                        ThreadForQueue2 t2 = new ThreadForQueue2("two");

                                        try {
                                            t1.thread.join();
                                            t2.thread.join();

                                        }catch (InterruptedException e){
                                            System.out.println(e);
                                        }


                                        break;
                                    }
                                    case (2): {
                                        break;
                                    }
                                    default:
                                        System.out.println("Choose between 1 or 2");
                                }
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
                            validateCustomException(newInt);

                            correctSize = true;
                        }
                        catch (WrongCollectionCapacity s){
                            System.out.println("Custom exception: " +s);

                        }
                        catch(Exception e){
                                System.out.println("Collection size is not correct. try again.");
                            }
                    }
                    while(true) {
                        System.out.println("Press 1 for input");
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
                    ThreadForQueue t1 = new ThreadForQueue("numbers");
                    ThreadForQueue2 t2 = new ThreadForQueue2("else_numbers");


                }
                case (4) : {
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
