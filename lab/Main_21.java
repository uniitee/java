import java.io.FileInputStream;
public class Main_21 {
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("stringfile.txt");
            int i;
            System.out.print("===> File Content: ");
            while ((i = fin.read()) != -1) {
                System.out.print((char) i);
            }
            fin.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}