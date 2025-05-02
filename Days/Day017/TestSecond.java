package Day017;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class TestSecond {
    
    public static void main(String[] args) {
        
        List<Integer> list = Arrays.asList(1, 2, 3, 2, 4, 5, 1);

        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = list.stream()
            .filter(x -> !seen.add(x))
            .collect(Collectors.toSet());

        System.out.println("Duplicate Elements: " + duplicates);


        List<Integer> uniques = list.stream().distinct().toList();
        System.out.println(uniques);

    }
}
