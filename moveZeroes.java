public class moveZeroes{
    public static void moveZeroes(int[] nums) {
        int i = 0; // Pointer for iterating the array
        int j = 0; // Pointer for placing non-zero elements

        // Iterate through the array
        while (i < nums.length) {
            // If the current element is non-zero, move it to the jth position and increment j
            if (nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            }
            i++;
        }

        // After iterating through the array, fill the remaining positions with 0
        while (j < nums.length) {
            nums[j] = 0;
            j++;
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
        // Output: 1 3 12 0 0
    }
}
