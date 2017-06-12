package TestFileWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Dmytro on 12.06.2017.
 */
public class FileWriteruse {
    public static void main(String[] args) throws IOException {
       // while(true) {
            Scanner scanner = new Scanner(System.in);

            FileWriter fileWriter = new FileWriter("C:\\Users\\Dmytro\\IdeaProjects\\GoIt Module One\\src\\TestFileWriter\\Test.txt");
            String testStr = scanner.nextLine();
            String stringToWrite = "";
            stringToWrite +=testStr+"\n";
            fileWriter.write(stringToWrite);
       // }
    }
}
