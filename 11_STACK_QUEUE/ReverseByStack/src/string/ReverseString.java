package string;

import java.util.Stack;

public class ReverseString {
    public static String reverseString(String strings) {
        Stack<String> wStack = new Stack<>();
        String[] words = strings.split(" ");
        for (String word : words) {
            wStack.push(word);
        }
        StringBuilder reversed = new StringBuilder();
        while (!wStack.isEmpty()) {
            reversed.append(wStack.pop());
            if (!wStack.isEmpty()) {
                reversed.append(" ");
            }
        }
        return reversed.toString();


    }
}
