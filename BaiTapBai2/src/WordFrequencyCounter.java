import java.util.Map;
import java.util.TreeMap;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        String text = "the whole world watched the sunset. My brother like to see the sunset.";

        text = text.toLowerCase().replaceAll("[^a-zA-Z\\s]", "");
        String[] words = text.split("\\s+");

        Map<String, Integer> map =new TreeMap<>();
        for(String word : words){
            if(!word.isEmpty()) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        }
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }}

