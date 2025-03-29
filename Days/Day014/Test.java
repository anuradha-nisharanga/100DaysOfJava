package Day014;

public class Test {
    
    // recap 
    public static void main(String[] args) {
        
        // String reverse
        String name = "Anuradha";
        String reversedName = "";

        for (int i = 0; i < name.length(); i++) {
            
            reversedName = name.charAt(i) + reversedName;
            
        }
        System.out.println("reversed name: " + reversedName);

        // merge sorted 2 arrays
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};

        int m = nums1.length;
        int n = nums2.length;
        System.out.println("m is :" + m);
        System.out.println("n is :" + n);
        int p1 = m-1;
        int p2 = n-1;
        int i = m + n - 1;

        while (p2>0) {
            
            if (p1>=0 && nums1[p1] > nums2[p2]) {   
                
                nums1[i--] = nums1[p1--];
            }
            else{
                nums1[i--] = nums2[p2--];
            }
        }
        
        System.out.print("Soted array: " + nums1);
        // to be continue

    }

}
