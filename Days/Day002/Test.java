import java.util.Scanner;

public class Test {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int t = in.nextInt(); // get the number of query count for 
        
        for(int i=0; i<t; i++){

            int a = in.nextInt(); // get integer a
            int b = in.nextInt(); // get integer b
            int n = in.nextInt(); // get integer n
           
            int y = 0;
            
            for(int x=0; x<n; x++){

                int z = (int)Math.pow(2, x);
                
                if (x == 0) {
                    y = a + z * b + y;
                }
                else{
                    y = y + z * b;
                }

                System.out.print( y + " ");
            }

            System.out.println();
        }
        in.close();
     
    }
}

