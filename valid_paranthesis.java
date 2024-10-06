import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;


/*
Valid Parentheses with Multiple Types

You are given a string s consisting of different types of parentheses: (), {}, and []. Your task is to determine whether the given string is valid.
A string is considered valid if:
Every opening bracket has a corresponding closing bracket of the same type.
The brackets are closed in the correct order. This means that a closing bracket must close the most recent unmatched opening bracket.

Input:
A string s consisting of characters (, ), {, }, [, and ].

Output:
Return true if the string is valid.
Return false if the string is invalid.

Examples:
Example 1
Input: s = "()"
Output: true
Explanation: The string contains only one pair of valid parentheses.

Constraints:
0 ≤ s.length ≤ 10^4
The string s contains only the characters ()[]{}.

Test Cases:
Input: s = "()"
Output: true
Input: s = "([)]"
Output: false
Input: s = "[{()}]"
Output: true
Input: s = “”
Output: true
Input: s = "{[}"
Output: false

Edge Cases:
Empty string: If the input string is empty, the output should be true since there are no parentheses to match.
Odd length string: If the string has an odd number of characters, it cannot be valid and should return false.
Unmatched closing brackets: If the string starts with a closing bracket, it is invalid.

*/

public class valid_paranthesis {
    static boolean is_valid_paranthesis1(String s) {
        Deque<Character> stack = new ArrayDeque<Character>();
        HashMap<Character, Character> h = new HashMap<>();
        h.put('{', '}');
        h.put('[', ']');
        h.put('(', ')');
        
        for(int i=0; i<s.length(); i++){
            if(h.containsKey(s.charAt(i))){
                stack.push(s.charAt(i));
            }
            else{
                if(stack.isEmpty() || s.charAt(i) != h.get(stack.peek())){
                    return false;
                }
                stack.pop(); 
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        String strs = "[{()}]";
        boolean result = is_valid_paranthesis1(strs);
        System.out.println(result);

        String strs1 = "[{(}]";
        result = is_valid_paranthesis1(strs1);
        System.out.println(result);
    }
}
