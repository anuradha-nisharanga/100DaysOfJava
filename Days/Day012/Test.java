package Day012;

import java.util.ArrayList;

public class Test {
    
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        numbers.forEach((n) -> {System.out.println(n);});
    }
}
