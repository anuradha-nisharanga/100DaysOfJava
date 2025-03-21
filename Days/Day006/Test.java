package Day006;

public class Test {

    public static void main(String[] args) {
        
        // Find array average
        int ages[] = {10, 20, 30, 40};

        float avg, sum = 0;

        int leght = ages.length;

        for (int age : ages) {
             sum += age;
        }

        // calculate average
        avg = sum/leght;

        System.out.println(avg);
    }
    
}
