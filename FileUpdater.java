import java.io.FileWriter;
import java.io.IOException;

public class FileUpdater {

    private String fileName;

    public FileUpdater(String fileName) {
        this.fileName = fileName;
    }

    public void updateContent(String newContent) {
        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write(newContent);
            writer.close();
            System.out.println("File updated successfully.");
        } catch (IOException e) {
            System.out.println("Error updating file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        FileUpdater obj = new FileUpdater("sample.txt");
        obj.updateContent("This is the updated content using OOP in Java.");
    }
}