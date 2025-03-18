import java.util.Scanner;

// Question : use a,b,n to create the follwing series
// (a + 2^0 * b), (a + 2^0 * b+ 2^1 * b)

// sample input value set
// **********************
// 2 [query count]
// 0 2 10 [1st value set]
// 5 3 5 [2nd value set]
// **********************

// sample output
// **********************
// 2 6 14 30 62 126 254 510 1022 2046
// 8 14 26 50 98
// **********************


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

