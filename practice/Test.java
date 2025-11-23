package practice;

import java.util.*;

public class Test {

    public static int maxMovesWithSameSum(int[] nums) {
        if (nums.length < 2) {
            return 0; // If the length of array is smaller than 2, no moves can be performed
        }

        Map<Integer, Integer> frequencyMap = new HashMap<>();
        int left = 0, right = nums.length - 1;

        while (left < right) {
            int sum = nums[left] + nums[right];
            frequencyMap.put(sum, frequencyMap.getOrDefault(sum, 0) + 1);

            left++;
            right--;
        }

        int maxFrequency = 0;
        for (int frequency : frequencyMap.values()) {
            maxFrequency = Math.max(maxFrequency, frequency);
        }

        return maxFrequency;
    }

    public static void main(String[] args) {
        // Example usage
        int[] nums = {1,1,2,3,1,2,2,1,2};
        int maxMoves = maxMovesWithSameSum(nums);
        System.out.println("Maximum number of moves with the same sum: " + maxMoves);
    }
}

