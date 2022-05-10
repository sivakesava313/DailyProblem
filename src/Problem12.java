/**
 * Input: s = "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 * Example 2:
 *
 * Input: s = "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1
 */

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Problem12 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the string");
        String a = obj.next();
        Set<Character> filter = new HashSet<>();
        for (int i = 0; i < a.length(); i++) {
            filter.add(a.charAt(i));
        }
        int cout = 0;
        for (char x:filter) {
            cout++;
        }
        System.out.println("the count is  "+cout );
    }
}
