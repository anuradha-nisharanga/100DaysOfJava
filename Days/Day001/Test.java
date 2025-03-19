public class Test {
    
    public static void main(String[] args) {
        
        int [] numberList = {1, 2, 3, 4, 5};

        int sum = 0;

        for (int i = 0; i < numberList.length; i++) {
            sum = sum + numberList[i];
        }

        System.out.println(sum);
     
    }
}
