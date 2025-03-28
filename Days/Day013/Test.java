package Day013;

public class Test {
    
    // count words
    public static void main(String[] args) {
        
        String words = "One Two Three Four";

        int countWords = words.split("\\s").length;
        int countLetters = words.length();

        System.out.println("word count is: " +countWords);
        System.out.println("letter count is: " +countLetters);
    }
}
