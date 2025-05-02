package Day017;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    
    public static void main(String[] args) {
        
        List<Integer> list = Arrays.asList(2, 2, 5, 10, 20, 12, 12);
        
        // Find MAX and MIN Element  
        int max = list.stream().max(Integer::compare).get();
        int min = list.stream().min(Integer::compare).get();

        System.out.println(max);
        System.out.println(min);

        // Find Second Highest and Second Lowest Value
        int secondHighest = list.stream().sorted(Comparator.reverseOrder()).distinct().skip(1).findFirst().get();
        int thirdHighest = list.stream().sorted(Comparator.reverseOrder()).distinct().skip(2).findFirst().get();
        int secondLowest = list.stream().sorted().distinct().skip(1).findFirst().get();
        
        System.out.println("Second Highest : " + secondHighest);
        System.out.println("third Highest : " + thirdHighest);
        System.out.println("Second Lowest : " + secondLowest);

        // Find All Even numbers
        // this one return mutable list.
        List<Integer> evenNumbersMutableList = list.stream().filter(x -> x % 2 == 0).sorted().collect(Collectors.toList());
        
        // this one return mutable list.
        List<Integer> evenNumbersImmutableList = list.stream().filter(x -> x % 2 == 0).sorted().toList(); 

 
        System.out.println("Even Numbers: " + evenNumbersMutableList);
        System.out.println("Even Numbers: " + evenNumbersImmutableList);

        // count element greater than x
        long count  = list.stream().filter(x -> x > 5).distinct().count();
        System.out.println("Count of Element > 5: " + count);

        
    }
}
