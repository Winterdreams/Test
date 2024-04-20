import java.util.*;

public class Main {
    public static void main(String[] args) {
        String str = "Hello World Pie";


        String[] words = str.split("\\s+");

        for (String word : words) {
            int count = 0;

                HashMap<Character, Integer> charCount = new HashMap<>();
                for (int j = word.length() - 1; j >= 0; j--) {
                    if (charCount.containsKey(word.charAt(j))) {
                        count = charCount.get(word.charAt(j));
                        charCount.put(word.charAt(j), ++count);
                    } else {
                        charCount.put(word.charAt(j), 1);
                    }
                }
                if (count >= 2){
                    System.out.println(word);
                }
        }

    }
}