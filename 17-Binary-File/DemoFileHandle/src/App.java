import java.io.*;

public class App {
    public static void main(String[] args) {
        try {
            File myFile = new File("data.txt");
            if (!myFile.exists()) {
                throw new FileNotFoundException("File " + myFile.getPath() + " not found");
            }
            if (!myFile.canWrite()) {
                throw new IllegalArgumentException("Cannot write to file " + myFile.getPath());
            }


            FileWriter fileWriter = new FileWriter(myFile);
//            fileWriter.write("Hello World");
//            fileWriter.write("\n");
//            fileWriter.write("Viet Nam");

            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("Hello World");
            bufferedWriter.newLine();
            bufferedWriter.write("CodeGym");


            bufferedWriter.close();
//            fileWriter.close();



        } catch (FileNotFoundException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
