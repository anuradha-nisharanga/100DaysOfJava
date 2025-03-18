package Day003;

import java.util.Scanner;

// Question : Determine the appropriate data type to properly store the input value.

// sample input value set
// **********************
// 5 [input value count]
// -150 [input 1]
// 150000 [input 2]
// 1500000000 [input 3]
// 213333333333333333333333333333333333 [input 4]
// -100000000000000 [input 5]
// **********************

// sample output value set
// **********************
// -150 can be fitted in:
// * short
// * int
// * long
// 150000 can be fitted in:
// * int
// * long
// 1500000000 can be fitted in:
// * int
// * long
// 213333333333333333333333333333333333 can't be fitted anywhere.
// -100000000000000 can be fitted in:
// * long
// **********************

public class Test {
    
    public static void main(String[] args) {
        
        // define scanner class
        Scanner sc = new Scanner(System.in);

        // use scanner object to get the count
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            
            try{
                long x = sc.nextLong();
                System.out.println(x + " can be fitted in:");
                if(x>=-128 && x<=127)System.out.println("* byte");
                if(x>=-32768 && x<=32767)System.out.println("* short");
                if(x>=-2147483648 && x<=2147483647)System.out.println("* int");
                if(x>=-9223372036854775808L && x<=9223372036854775807L)System.out.println("* long");
            }
            catch(Exception e){
                System.out.println(sc.next() + " can't be fitted anywhere");
            }
        }
    }
}
