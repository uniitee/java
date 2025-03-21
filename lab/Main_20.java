import java.io.FileOutputStream;
public class Main_20 {
    public static void main(String[] args) {
        try {
            FileOutputStream fout = new FileOutputStream("stringfile.txt");
            String data = "Hello, Java!";
            fout.write(data.getBytes());
            fout.close();
            System.out.println("===> String Data Written Successfully");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}