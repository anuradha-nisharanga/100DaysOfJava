package Day019;

public class Test {
    
    public static void main(String[] args) {
        
        String fullName = "Anuradha Nisharanga";
        

        // Get substring from index 0 to 8 (exclusive)
        String firstName = fullName.substring(0, 7);
        
        // Get substring from index 10 to the end
        String lastName = fullName.substring(9);

        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: "  + lastName);
    }
}
