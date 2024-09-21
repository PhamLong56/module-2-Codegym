import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.sql.SQLOutput;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[100000];
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100000);
        }
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        SelectionSort.selectionSort(numbers);
        stopWatch.stop();
        System.out.println(numbers.length);
        System.out.println("Elapses time for sorting 100.000 number: "+ stopWatch.getElapsedTime()+"milliseconds");
    }
}
