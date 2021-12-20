using System;
using System.Collections.Generic;

namespace LeetCode
{
    /// <summary>
    /// Solution to the 2Sum Problem.
    /// Runtime: 128 ms, faster than 90.09% of C# online submissions for Two Sum.
    /// Memory Usage: 42.7 MB, less than 26.69% of C# online submissions for Two Sum.
    /// </summary>
    public static class TwoSumSolution
    {
        /// <summary>
        /// Time Complexity:
        /// <code>O(n) = (n * 2) + n </code>
        /// </summary>
        /// <param name="nums"></param>
        /// <param name="target"></param>
        /// <returns></returns>
        public static int[] TwoSum(int[] nums, int target)
        {
            var set = new HashSet<int>(nums);
            for (var i = 0; i < nums.Length; i++)
            {
                var maybe = target - nums[i];
                if (!set.Contains(maybe)) continue;
                for (var j = i + 1; j < nums.Length; j++)
                {
                    if (nums[j] == maybe)
                    {
                        return new[] { i, j };
                    }
                }
            }

            return new []{ -1, -1 };
        }
    }
}