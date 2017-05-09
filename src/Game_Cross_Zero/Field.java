package Game_Cross_Zero;

import java.util.Scanner;

/**
 * Created by Dmytro on 08.05.2017.
 */
public class Field {
    String[][] gameField;
    String move;
    int fieldSize;

    public Field(String[][] gameField, int fieldSize) {
        this.gameField = gameField;
        this.fieldSize = fieldSize;

    }



/*
    public Field(int fieldSize) {
        this.gameField = new  String[fieldSize][fieldSize];
    }
*/


    //illustrating a game field to see what squares are busy with"x" or "0"
    public void showGameField(String[][] gameField) {
        for (int i = 0; i < gameField.length; i++) {
            for (int j = 0; j < gameField.length; j++) {
                System.out.print(gameField[i][j]+" ");

            }
            System.out.println("\n");


        }

    }

    //checking if square is busy
    public void checkSquare(String[][] gameField) {
        for (int i = 0; i <gameField.length ; i++) {
            for (int j = 0; j <gameField.length ; j++) {
                if (gameField[i][j] == "x" || gameField[i][j] == "O") {
                    System.out.println("Square is busy, make another choice.");
                }

            }

        }
    }

    //checking squares for win
    public void checkWin(String[][] gameField) {
       if((gameField[0][0].equals("X") & gameField[0][1].equals("X") & gameField[0][2].equals("X")) ||
               (gameField[1][0].equals("X") & gameField[1][1].equals("X") & gameField[1][2].equals("X")) ||
               (gameField[2][0].equals("X") & gameField[2][1].equals("X") & gameField[2][2].equals("X")) ||
               (gameField[0][0].equals("X") & gameField[1][1].equals("X") & gameField[1][2].equals("X")) ||
               (gameField[0][2].equals("X") & gameField[1][1].equals("X") & gameField[2][0].equals("X"))){
           System.out.println("Human wins!!");
           System.exit(0);

        }
        else if((gameField[0][0].equals("O") & gameField[0][1].equals("O") & gameField[0][2].equals("O")) ||
               (gameField[1][0].equals("O") & gameField[1][1].equals("O") & gameField[1][2].equals("O")) ||
               (gameField[2][0].equals("O") & gameField[2][1].equals("O") & gameField[2][2].equals("O")) ||
               (gameField[0][0].equals("O") & gameField[1][1].equals("O") & gameField[1][2].equals("O")) ||
               (gameField[0][2].equals("O") & gameField[1][1].equals("O") & gameField[2][0].equals("O"))){
           System.out.println("Robot wins!!");
           System.exit(0);

       }


    }


}
