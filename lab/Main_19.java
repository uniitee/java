import java.io.FileOutputStream;
import java.io.IOException;
public class Main_19 {
    public static void main(String[] args) {
        String data = "Hello, this is a test file!";
        String fileName = "output.txt";
        try (FileOutputStream fos = new FileOutputStream(fileName)) {
            fos.write(data.getBytes());
            System.out.println("File created and data written successfully!");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}