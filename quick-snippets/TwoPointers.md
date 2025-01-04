# 1. General Template for Two Pointers in Java (reduces time complexity from O(n²) to O(n))

```Java

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

```

**Two-Pointers Technique**:

### 1. **Pair Sum Problems**
   - **Two Sum (sorted array)**: Find two numbers that sum up to a target value in a sorted array.
   - **Pair with a Difference**: Find two elements in a sorted array whose difference equals a given value.

### 2. **Sorted Array Problems**
   - **Removing Duplicates from Sorted Array**: Remove duplicates from a sorted array in-place.
   - **Move Zeros**: Move all zeros to the end of an array while maintaining the relative order of non-zero elements.
   - **Sort Colors (Dutch National Flag)**: Sort an array with three distinct values (e.g., 0s, 1s, and 2s) using two pointers.
   
### 3. **Subarray Problems**
   - **Longest Subarray with Sum ≤ Target**: Find the longest subarray where the sum is less than or equal to the target.
   - **Smallest Subarray with Sum ≥ Target**: Find the smallest subarray whose sum is greater than or equal to a given value.
   - **Max Consecutive Ones**: Find the maximum number of consecutive 1s in a binary array.
   
### 4. **String Problems**
   - **Valid Palindrome**: Check if a string is a valid palindrome (can be solved by using two pointers starting from both ends).
   - **Reverse Vowels in a String**: Reverse only the vowels in a given string using two pointers.
   - **Longest Substring without Repeating Characters**: Find the length of the longest substring without repeating characters using sliding windows with two pointers.
   - **Minimize the Window Size**: Find the smallest window that contains all characters of a target string.

### 5. **Sorting/Partitioning Problems**
   - **Partitioning Arrays**: Partition an array into two parts based on a pivot value (e.g., Dutch National Flag).
   - **Rearrange Elements**: Move negative numbers to one side and positive numbers to the other side.
   - **Merging Two Sorted Arrays**: Use two pointers to merge two sorted arrays into one.

### 6. **Merging Intervals**
   - **Merge Intervals**: Given a list of intervals, merge all overlapping intervals.
   - **Insert Interval**: Insert a new interval into a list of sorted intervals and merge if necessary.

### 7. **Two-pointer on Triplets**
   - **3Sum**: Find all unique triplets in an array that sum up to a target (usually zero).
   - **3Sum Closest**: Find the triplet in an array whose sum is closest to the target.
   - **3Sum Smaller/Larger**: Count all triplets where the sum is smaller or larger than the target.

### 8. **Sliding Window Problems**
   - **Sliding Window Maximum**: Find the maximum value in each sliding window of a given size.
   - **Longest Substring with At Most K Distinct Characters**: Find the length of the longest substring with at most K distinct characters.

### 9. **Trapping Rain Water**
   - **Trapping Rain Water**: Calculate how much water can be trapped between buildings (heights) using two pointers.

### 10. **Container with Most Water**
   - **Max Area (Container with Most Water)**: Find two lines that form the container which can hold the most water.

### 11. **Binary Search Problems (Variations)**
   - **Search in Rotated Sorted Array**: Find an element in a rotated sorted array using modified two-pointers (essentially a binary search with conditions).
   - **Find Minimum in Rotated Sorted Array**: Find the minimum element in a rotated sorted array.
   
### 12. **Linked List Problems**
   - **Detect a Cycle in Linked List**: Use the two-pointer technique (slow and fast pointer) to detect a cycle in a linked list.
   - **Find the Middle of a Linked List**: Use two pointers (one moving twice as fast) to find the middle of the list.
   - **Remove N-th Node from End of List**: Use two pointers to locate the N-th node from the end of the linked list.

### 13. **Palindrome Linked List**
   - **Check if Linked List is a Palindrome**: Use two pointers and reverse the second half of the linked list to check if it’s a palindrome.

### 14. **Find Intersection in Linked Lists**
   - **Intersection of Two Linked Lists**: Use two pointers to find the node where two singly linked lists intersect.

### 15. **Meeting Point Problems**
   - **Meeting Point of Two Moving Entities**: Use two pointers to determine when two entities moving at different speeds or rates will meet (similar to cycle detection).

### 16. **Backtracking with Two Pointers**
   - **Subsets/Combinations with Sum Constraints**: Problems like finding all subsets or combinations that satisfy a sum constraint can sometimes be optimized with two pointers and backtracking.

### 17. **K-diff Pairs in an Array**
   - **K-diff Pairs**: Given an array, find all pairs with an absolute difference of K.

### 18. **Intersection of Two Arrays**
   - **Intersection of Two Sorted Arrays**: Find the intersection of two sorted arrays using two pointers.

### 19. **Minimum Difference Between Pairs**
   - **Find Minimum Absolute Difference Between Two Arrays**: Find the pair with the minimum absolute difference between two sorted arrays.

### 20. **Maximize Distance to Closest Person**
   - **Maximize Distance in an Array**: Given an array representing seating (0s and 1s), find the best seat to maximize the distance from the nearest occupied seat.
