import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordCount {
    public static void main(String[]args) throws FileNotFoundException {
        File file = new File("word.txt");
        Scanner scanner =new Scanner(file);
        int words=0;

        while(scanner.hasNextLine()==true){
            String line = scanner.nextLine();
            int wordsline=line.split(" ").length;
            words = words+wordsline;
        }
        System.out.println("the number of words present in file are:" +words);
    }
}
