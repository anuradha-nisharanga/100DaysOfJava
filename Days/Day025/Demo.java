package Day025;

public class Demo {

    public static void main(String[] args) {
        int nums[] = {1, 3, 5, 9, 11};
        int target = 11;

        int result = binarySearch(nums, target);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        }
        else{
            System.out.println("Element not found");
        }
    }

    private static int binarySearch(int[] nums, int target) {
        
        int left = 0;
        int right = nums.length -1;

        while (left <= right) {
            
            int middle = (left + right)/2;
            
            if (nums[middle] == target) {
                return middle;
            }
            else if (nums[middle] < target) {
                left = middle + 1;
            }
            else{
                right = middle - 1;
            }
        }
        
        return -1;
    }

    private static int linearSearch(int[] nums, int target) {
        
        for (int i = 0; i < nums.length; i++) {
            
            if(nums[i] == target){
                return i;    
            }
        }

        return -1;
    }
}