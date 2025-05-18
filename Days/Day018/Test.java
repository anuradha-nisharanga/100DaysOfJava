package Day018;

public class Test {
    
    public static void main(String[] args) {
        
        int num  = 7;

        int result = num++;              // post increment
        int preIncrementResult = ++num;  // pre increment
        
        for (int i = 0; i < result; i++) {
            System.out.println(i);       // 0,1,2,3,4,5,6
        }
        System.out.println("===========");

        for (int i = 0; i < preIncrementResult; i++) {
            System.out.println(i);       // 0,1,2,3,4,5,6,7,8
        }
    }
}
