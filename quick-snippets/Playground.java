public class TwoPointersTemplate {
    public void solve(int[] nums) {
        int left = 0, right = nums.length - 1;
        
        while (left < right) {
            // Perform operations based on the problem's condition
            if (nums[left] + nums[right] == target) {
                // Do something, e.g., store result
                break;
            } else if (nums[left] + nums[right] < target) {
                left++;  // Move left pointer to increase the sum
            } else {
                right--; // Move right pointer to decrease the sum
            }
        }
    }
}
