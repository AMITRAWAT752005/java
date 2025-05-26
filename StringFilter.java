import java.util.*;

public class StringFilter {
    public static void removeEvenLength(ArrayList<String> list) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            String str = it.next();
            if (str.length() % 2 == 0) {
                it.remove();
            }
        }
    }
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("apple");
        words.add("banana");
        words.add("kiwi");
        words.add("pear");
        words.add("grape");

        System.out.println("Before: " + words);
        removeEvenLength(words);
        System.out.println("After: " + words);
    }
}
