import java.util.*;

public class Main {
    public static void main(String[] args) {
        int maxcount = 0;
        var maxword = "";
        var result = "";

        String str = "Hello World Pie";
        String token = "0t8kbToken";

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

            if (count > maxcount){
                maxword = word;
                maxcount = count;
            }
        }

        if (maxcount > 1) {
            result = maxword + token;
        } else {
            result = -1 + token ;
        }

        System.out.println(Replace(result));
    }
    public static String Replace(String result){
        StringBuilder finalword = new StringBuilder();

        for (int i = 0; i < result.length(); i++)
        {
            if (((i+1) % 4) == 0)
                finalword.append("_");
            else
                finalword.append(result.charAt(i));
        }
        return finalword.toString();
    }
}