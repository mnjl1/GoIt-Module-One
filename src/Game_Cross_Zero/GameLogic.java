package Game_Cross_Zero;

import java.util.Scanner;

/**
 * Created by Dmytro on 08.05.2017.
 */

public class GameLogic {
    Scanner scanner = new Scanner(System.in);

    //game method starts whole game logic
    public void game() {
        int fieldSize = 3;
        String[][] field = {{"1", "2", "3"}, {"4", "5", "6"}, {"7", "8", "9"}};

        Field game = new Field(field, fieldSize);


        while (true) {
            game.showGameField(field);
            game.checkWin(field);
            //choose who moves?
            System.out.println("Who moves?");
            System.out.println("1.Human");
            System.out.println("2.Robot");

            int choice = scanner.nextInt();

            switch (choice) {

                //human move logic
                case (1): {
                    System.out.println("Make you move, Human: enter from 0 to 9");

                    int humanMove = 0;
                    boolean isInteger = false;

                    while (!isInteger) {
                        try {
                            humanMove = Integer.parseInt(scanner.next());
                            isInteger = true;

                        } catch (Exception e) {
                            System.out.println("Not Integer from 0 to 9.");
                        }
                    }


                    switch (humanMove) {
                        case (1):
                            game.gameField[0][0] = "X";

                            break;

                        case (2):
                            game.gameField[0][1] = "X";
                            break;

                        case (3):
                            game.gameField[0][2] = "X";
                            break;

                        case (4):
                            game.gameField[1][0] = "X";
                            break;

                        case (5):
                            game.gameField[1][1] = "X";
                            break;

                        case (6):
                            game.gameField[1][2] = "X";
                            break;

                        case (7):
                            game.gameField[2][0] = "X";
                            break;

                        case (8):
                            game.gameField[1][1] = "X";
                            break;

                        case (9):
                            game.gameField[1][2] = "X";
                            break;

                        default:
                            System.out.println("Make your choice, Human.");


                    }continue;


                }

                //robot move logic
                case (2):
                    System.out.println("Robot is moving...");
                    double robotChoice= Math.random()*10;
                    int robotMove = (int) robotChoice;

                    switch (robotMove) {

                        case (1):
                            game.gameField[0][0] = "O";

                            break;

                        case (2):
                            game.gameField[0][1] = "o";
                            break;

                        case (3):
                            game.gameField[0][2] = "O";
                            break;

                        case (4):
                            game.gameField[1][0] = "O";
                            break;

                        case (5):
                            game.gameField[1][1] = "O";
                            break;

                        case (6):
                            game.gameField[1][2] = "O";
                            break;

                        case (7):
                            game.gameField[2][0] = "O";
                            break;

                        case (8):
                            game.gameField[1][1] = "O";
                            break;

                        case (9):
                            game.gameField[1][2] = "O";
                            break;

                        default:
                            System.out.println("Make your choice, Robot.");





                    }


            }


        }


    }
}




