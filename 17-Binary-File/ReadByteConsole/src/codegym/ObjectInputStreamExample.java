package codegym;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStreamExample {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("product.txt"));
            Product product =(Product) ois.readObject();
            System.out.println(product);
        }catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }finally {
            ois.close();
        }

    }
}
