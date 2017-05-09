package Game_Cross_Zero;

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
        boolean legalMove = false;
        for (int i = 0; i <gameField.length ; i++) {
            for (int j = 0; j <gameField.length ; j++) {
                if (gameField[i][j] == "X" || gameField[i][j] == "O") {
                    continue;
                }else legalMove=true;
            }
        }
    }

    //checking squares for win
    public void checkWin(String[][] gameField) {
       if((gameField[0][0].equals("X") & gameField[0][1].equals("X") & gameField[0][2].equals("X")) |
               (gameField[1][0].equals("X") & gameField[1][1].equals("X") & gameField[1][2].equals("X")) |
               (gameField[2][0].equals("X") & gameField[2][1].equals("X") & gameField[2][2].equals("X")) |
               (gameField[0][0].equals("X") & gameField[1][1].equals("X") & gameField[2][2].equals("X")) |
               (gameField[0][2].equals("X") & gameField[1][1].equals("X") & gameField[2][0].equals("X"))){
           System.out.println("Human wins!!");
           System.exit(0);

        }
        else if((gameField[0][0].equals("O") & gameField[0][1].equals("O") & gameField[0][2].equals("O")) |
               (gameField[1][0].equals("O") & gameField[1][1].equals("O") & gameField[1][2].equals("O")) |
               (gameField[2][0].equals("O") & gameField[2][1].equals("O") & gameField[2][2].equals("O")) |
               (gameField[0][0].equals("O") & gameField[1][1].equals("O") & gameField[2][2].equals("O")) |
               (gameField[0][2].equals("O") & gameField[1][1].equals("O") & gameField[2][0].equals("O"))){
           System.out.println("Robot wins!!");
           System.exit(0);

       }
       else if (
               (gameField[0][0]=="X" | gameField[0][0]=="O") &
               (gameField[0][1]=="X" | gameField[0][1]=="O") &
               (gameField[0][2]=="X" | gameField[0][2]=="O") &
               (gameField[1][0]=="X" | gameField[1][0]=="O") &
               (gameField[1][1]=="X" | gameField[1][1]=="O") &
               (gameField[1][2]=="X" | gameField[1][2]=="O") &
               (gameField[2][0]=="X" | gameField[2][0]=="O") &
               (gameField[2][1]=="X" | gameField[2][1]=="O") &
               (gameField[2][2]=="X" | gameField[2][2]=="O")

               ){
           System.out.println("No Win No Loose");
           System.exit(0);

       }

    }
}
