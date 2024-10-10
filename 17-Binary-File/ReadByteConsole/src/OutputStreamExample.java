import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamExample {
    public static void main(String[] args) throws IOException {
        OutputStream os = new FileOutputStream("output.txt");
        byte[] bytes = new byte[]{ 'C', 'o', 'd', 'e', 'G', 'y', 'm' };
        for (int i = 0; i < bytes.length; i++) {
            byte b = bytes[i];
            os.write(b);
        }
        os.close();
    }
}
