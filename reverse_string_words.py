'''
Reverse a String Word by Word

You are given a string s that consists of multiple words separated by spaces. Your task is to reverse the order of the words in the string. Words are defined as sequences of non-space characters. The output string should not contain leading or trailing spaces, and multiple spaces between words should be reduced to a single space.

Input:
A string s of length n (1 ≤ n ≤ 10^4) consisting of letters, digits, punctuation, and spaces.

Output:
A string where the words in s are reversed, with a single space separating the words, and no leading or trailing spaces.

Examples:
Example 1
Input: "the sky is blue"
Output: "blue is sky the"
Explanation: The input string has leading and trailing spaces, which are removed in the output, and the words are reversed.
Example 2
Input: "  hello world  "
Output: "world hello"
Explanation: The input string has leading and trailing spaces, which are removed in the output, and the words are reversed.
Example 3
Input: "a good   example"
Output: "example good a"
Explanation: The input string contains multiple spaces between the words. These are reduced to a single space, and the words are reversed in the output.

Constraints:
1 ≤ s.length ≤ 10^4
The string s may contain leading or trailing spaces.
Words in s are separated by one or more spaces.
s contains printable ASCII characters.

Test Cases:
Input: "the sky is blue"
Output: 
Input: "  hello world  "
Output: "world hello"
Input: "a good   example"
Output: "example good a"
Input: "    "
Output: “”
Input: "word"
Output: "word"

Edge Cases:
All spaces: If the string consists of only spaces, the output should be an empty string.
Single word: If the string contains only one word, the output should be the same word without any additional spaces.
Multiple spaces between words: All extra spaces between words should be reduced to a single space.

'''

class Solution:
    def reverse_words(self, s: str) -> str:
        return ' '.join(s.split()[::-1])
    
if __name__ == '__main__':
    input_string = input("Enter a string: ")
    print("The reversed string is:")
    obj = Solution()
    print(obj.reverse_words(input_string))

