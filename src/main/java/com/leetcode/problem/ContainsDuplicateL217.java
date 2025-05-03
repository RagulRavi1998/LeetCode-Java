package com.leetcode.problem;

import java.util.HashSet;

// Check if the given array contains duplicate elements
public class ContainsDuplicateL217 {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>(); // Initializing a hash set
        for (int i = 0; i < nums.length; i++) { // Iterating over the array
            if (set.contains(nums[i])) { // Checking if the current element is present in the set
                return true; // If it is already present, then it contains duplicates
            }
            set.add(nums[i]); // Adding the element in the array if it is not already added
        }
        return false; // This line will execute if none of the elements present in the set is repeated again
    }
}

// Time Complexity - O(n)
// We have done 1 iteration in for loop which takes O(n) time.
// The condition we are checking that if the set contains the current element takes O(1) times.
// Although in worst case, it can go up to O(nlogn) if the hashing collision occurs. But in java, the algorithm is written strong such that collision does not occur
