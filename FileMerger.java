import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileMerger {

    private String file1;
    private String file2;
    private String outputFile;

    // Constructor
    public FileMerger(String file1, String file2, String outputFile) {
        this.file1 = file1;
        this.file2 = file2;
        this.outputFile = outputFile;
    }

    public void mergeFiles() {
        try {
            // Read contents of both files
            String content1 = new String(Files.readAllBytes(Paths.get(file1)));
            String content2 = new String(Files.readAllBytes(Paths.get(file2)));

            // Merge content
            String mergedContent = content1 + "\n" + content2;

            // Write into output file (overwrite mode)
            Files.write(Paths.get(outputFile), mergedContent.getBytes());

            System.out.println("Files merged successfully.");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {

        FileMerger obj = new FileMerger("file1.txt", "file2.txt", "merged.txt");
        obj.mergeFiles();
    }
}