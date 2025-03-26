package Day011;

public class Test {
    
    // find smallest element
    public static void main(String[] args) {
        
        int[] ageList = {18, 22, 25, 30};

        int lowestAge = ageList[0];

        for(int age : ageList){

            if (lowestAge > age) {
                
                lowestAge = age;
            }
        }

        System.out.println(lowestAge);
    }
}
