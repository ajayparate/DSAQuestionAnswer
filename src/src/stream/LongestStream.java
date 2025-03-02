package src.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class LongestStream {
    //for duplicate Element
    public static void main(String[] rfs){
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,88,8,7,9,8,7,4,5,6,3,2);

        Set<Integer> duplicates = numbers.stream()
                .collect(Collectors.groupingBy(i->i, Collectors.counting())).
        entrySet().stream().filter(entry ->entry.getValue()>1)
                .map(Map.Entry::getKey).collect(Collectors.toSet());
        System.out.println(duplicates);
    }


    
}
