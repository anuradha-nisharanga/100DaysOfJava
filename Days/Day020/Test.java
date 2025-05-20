package Day020;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    
    public static void main(String[] args) {
        
        List<String> names = new ArrayList<>();
        names.add("anuradha");
        names.add("harini");
        names.add("manusha");
        names.add("rashith");
        names.add("Kamal");

        List<String> longNames = new ArrayList<>();

        // Traditional way to work with List
        for (String name: names) {
            if (name.length() > 6) {
                longNames.add(name.toUpperCase());
            }
        }

        // With Stream API 
        longNames = names.stream()
        .filter(name -> name.length() > 6)
        .map(String::toUpperCase)
        .collect(Collectors.toList());

        longNames.forEach(System.out::println);
        
    }
}
