import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileReplacer {

    private String fileName;

    public FileReplacer(String fileName) {
        this.fileName = fileName;
    }

    public void replaceText(String oldWord, String newWord) {
        try {
            String content = new String(Files.readAllBytes(Paths.get(fileName)));
            content = content.replace(oldWord, newWord);

            Files.write(Paths.get(fileName), content.getBytes());

            System.out.println("Content replaced successfully.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    public void appendText(String newText) {
        try {
            Files.write(
                Paths.get(fileName),
                newText.getBytes(),
                StandardOpenOption.APPEND
            );

            System.out.println("Content appended successfully.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {

        FileReplacer obj = new FileReplacer("sample.txt");

        obj.replaceText("Java", "OOPS");
        obj.appendText("\nThis line is appended at the end.");
    }
}