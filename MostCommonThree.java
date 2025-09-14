import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.*;


class MostCommonThree{
    public List<String> mostCommonThree(String inputString) {
        //hashmap to keep track of key value pairs rerurned from the input
        Map<String, Integer> map = new HashMap<>();
        String[] words = inputString.split(" ");

        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        //System.out.println("Map as at now:"+map);

        //This is from the web Did not know how to order a hashmap
        List<String> topThree = map.entrySet()
                .stream()
                .sorted((e1, e2) -> {
                    int cmp = e2.getValue().compareTo(e1.getValue());
                    if (cmp == 0) {
                        return e1.getKey().compareTo(e2.getKey());
                    }
                    return cmp;
                })
                .limit(3)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());



        return topThree;
    }
    public static void main(String[] args) {
        MostCommonThree m3 = new MostCommonThree();
        System.out.println(m3.mostCommonThree("I wanna give a warm applause to a very very important persron and he is here and wants to talk"));
    }
}