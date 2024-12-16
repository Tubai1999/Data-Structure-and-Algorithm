package Recursion;

public class CountOccurString {
    public static int count(String text, String word) {
        //You can code here
        int tSize = text.length();
        int wSize = word.length();
        return countOccurrences(text,word,0);
    }


    public static int countOccurrences(String str, String word, int index) {
        if (index >= str.length() - word.length() + 1) {
            return 0;
        }

        if (str.substring(index, index + word.length()).equals(word)) {
            return 1 + countOccurrences(str, word, index + 1);
        } else {
            return countOccurrences(str, word, index + 1);
        }
    }
}
