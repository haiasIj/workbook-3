import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        try
        {
            FileInputStream gold = new FileInputStream("src/main/resources/DataFiles/goldilocks.txt");
            FileInputStream hansel = new FileInputStream("src/main/resources/DataFiles/hansel_and_gretel.txt");
            FileInputStream mary = new FileInputStream("src/main/resources/DataFiles/mary_had_a_little_lamb.txt");

            Scanner scanner = new Scanner(gold);
            Scanner scanner1 = new Scanner(hansel);
            Scanner scanner2 = new Scanner(mary);
            String input;

            while(scanner.hasNextLine()) {
                input = scanner.nextLine();
                System.out.println(input);
            }

            scanner.close();
        }
        catch(IOException e) {

            e.printStackTrace();
        }
    }


}