package Day004;

// Reverse a String
public class Task {

    public static void main(String[] args) {
        
        String value  = "Hellow!";
        String reversedValue = "";

        for (int i = 0; i < value.length(); i++) {
            
            reversedValue = value.charAt(i) + reversedValue;
            System.out.println(reversedValue);
        }
    }
    
}
