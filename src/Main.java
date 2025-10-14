import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        int lines = 0;
        int words = 0;
        int characters = 0;
        try(BufferedReader br = new BufferedReader(new FileReader("article.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                lines++;
                words += line.split(" ").length;
                characters += line.length();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Please create article.txt!");
        } catch (IOException e) {
            System.out.println("File I/O error! " + e.getMessage());
        }
        System.out.println("Lines: " + lines);
        System.out.println("Words: " + words);
        System.out.println("Characters: " + characters);
    }
}
