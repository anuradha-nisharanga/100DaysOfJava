import java.util.Scanner;

public class Test {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int t = in.nextInt();
        
        for(int i=0; i<t; i++){

            System.out.println("query : " + i);

            int a = in.nextInt();
            System.out.println("a is: "+ a);

            int b = in.nextInt();
            System.out.println("b is: "+ b);

            int n = in.nextInt();
            System.out.println("n is: "+ n);

            int y = 0;
            
            for(int x=0; x<n; x++){

                int z = (int)Math.pow(2, x);
                
                if (x == 0) {
                    y = a + z * b + y;
                }
                else{
                    y = y + z * b;
                }
                
                
                System.out.print(" " + y + " ");
            }
        }
        in.close();
     
    }
}
