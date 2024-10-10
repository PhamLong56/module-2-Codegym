import java.util.HashMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] arr =  {1, 3, 4, 1, 2, 4, 2, 3, 5, 7};

    }
    public static int countDup(int[] arr) {
        HashMap<Integer, Integer> count = new HashMap<>();
        int duplicateCount = 0;


    }
}

//public static void main(String[] args) {
//    int[] arr = {1, 3, 4, 1, 2, 4, 2, 3, 5, 7};
//    int duplicateCount = countDuplicates(arr);
//    System.out.println("Số lượng phần tử trùng lặp: " + duplicateCount);
//}
//
//public static int countDuplicates(int[] array) {
//    HashMap<Integer, Integer> countMap = new HashMap<>();
//    int duplicateCount = 0;
//
//    // Đếm số lần xuất hiện của từng phần tử
//    for (int num : array) {
//        countMap.put(num, countMap.getOrDefault(num, 0) + 1);
//    }
//
//    // Đếm số phần tử trùng lặp
//    for (int count : countMap.values()) {
//        if (count > 1) {
//            duplicateCount++;
//        }
//    }
//
//    return duplicateCount;
//}
//}