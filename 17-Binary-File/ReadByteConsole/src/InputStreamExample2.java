import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamExample2 {
    public static void main(String[] args) throws IOException {
        InputStream in = new FileInputStream("src/CodeGym2.txt");
        byte[] bytes = new byte[11];
        int i = -1;
       while ((i = in.read(bytes)) != -1) {
           System.out.println(new String(bytes, 0, i));
       }
        in.close();
    }
}
