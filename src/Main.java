import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Set;
public class Main {
    public static void main(String[] args) {
        zadanie4(List.of("A", "A", "B", "B", "b", "b", "C", "v", "e"));
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        for (Integer number : nums) {
            if (number % 2 == 1) {
                System.out.println(number);
            }
        }
        System.out.println("___________________________________");
        Set<Integer> set = new TreeSet<>(nums);
        for (Integer number : set) {
            if (number % 2 == 0) {

                System.out.println(number);
            }

        }
        System.out.println("___________________________________");
        System.out.println();
        List<String> words = new ArrayList<>(List.of("A", "A", "B", "B", "b", "b", "C"));
        for (String word : words) {
            if (Collections.frequency(words, word) == 1) {
                System.out.println(word);
            }
        }
        System.out.println("___________________________________");


    }
    public static void zadanie4(List < String > words){
        Map<String, Integer> map = new TreeMap<>();
        for (String word : words) {
            if (!map.containsKey(word)) {
                map.put(word, 1);
            } else {
                map.replace(word, map.get(word) + 1);
            }
        }
        int wordIteration = 0;
        for (Integer cout : map.values()) {
            if (cout>1) {
                wordIteration++;
            }
        }
        System.out.println("Кол-во повторений слов: " + wordIteration);

        System.out.println("___________________________________");

    }
}