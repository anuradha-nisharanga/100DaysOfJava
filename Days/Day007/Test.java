package Day007;

import java.util.HashMap;

public class Test {
    
    public static void main(String[] args) {

        // Create a HashMap object
        HashMap<String, String> capitalCities = new HashMap<String, String>();

        capitalCities.put("England", "London");
        capitalCities.put("Germanay", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("SriLanka", "JayawardanaPura");

        System.out.println(capitalCities);

        // Access item using key
        String capitalOfEngland = capitalCities.get("England");
        System.out.println(capitalOfEngland);

        // Remove item using key
        capitalCities.remove("England");
        System.out.println(capitalCities);

        // iterate using keys
        for(String i : capitalCities.keySet()){
            System.out.println(i);
        }

        // iterate using values
        for(String i : capitalCities.values()){
            System.out.println(i);
        }
    }
}
