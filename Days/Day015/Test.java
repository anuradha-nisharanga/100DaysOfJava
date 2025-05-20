package Day015;

public class Test {
    
    public static void main(String[] args) {
        
        // SOLID principles
        // S - Single responsibility
        // O - Open/Closed
        // L - Liskov Substitution
        // I - Interface Segregation
        // D - Depenendency Inversion

        // Single Responsibility  - a class should only have a one responsibility
        
        User user = new User("Anuradha", "anuradha@gmail.com");
        UserFileManager fileManager = new UserFileManager();
        fileManager.saveToFile(user);
    }
}
