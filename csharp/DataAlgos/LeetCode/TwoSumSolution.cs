using System;
using System.Collections.Generic;

namespace LeetCode
{
    public static class TwoSumSolution
    {
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