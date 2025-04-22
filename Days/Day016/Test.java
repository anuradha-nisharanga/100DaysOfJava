package Day016;

import java.util.ArrayList;
import java.util.List;

public class Test {
    
    public static void main(String[] args) {
        
        List<String> myList = new ArrayList<>();
        myList.add("Tets");
        myList.add("xyz");
        myList.add("YYY");
        
        String firstString = myList.stream().findFirst().get();
        System.out.println(firstString);
    }

}