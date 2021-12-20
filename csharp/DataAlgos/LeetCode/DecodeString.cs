using System;
using System.Text.RegularExpressions;

namespace LeetCode
{
    public class DecodeStringSolution
    {
        private static Regex _regex = new Regex("[0-9][[][a-z][[]{1,30}");
        
        public string DecodeString(string s)
        {
            if (string.IsNullOrWhiteSpace(s) || !_regex.IsMatch(s))
            {
                throw new ArgumentException(nameof(s));
            }

            return "";
        }
    }
}