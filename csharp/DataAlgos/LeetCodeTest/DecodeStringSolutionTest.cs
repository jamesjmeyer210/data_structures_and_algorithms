using System;
using LeetCode;
using Xunit;

namespace LeetCodeTest
{
    public class DecodeStringSolutionTest
    {
        private readonly DecodeStringSolution _solution;

        public DecodeStringSolutionTest()
        {
            _solution = new DecodeStringSolution();
        }

        [Theory]
        [InlineData("ABC")]
        public void InvalidInput(string input)
        {
            Assert.Equal("aaabcbc",  _solution.DecodeString("3[a]2[bc]"));
        }
        
        [Fact]
        public void Test1()
        {
            Assert.Equal("aaabcbc",  _solution.DecodeString("3[a]2[bc]"));
        }
    }
}