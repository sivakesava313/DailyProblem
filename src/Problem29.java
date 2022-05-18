/**
 * Example 1:
 * Input: s = "Hello World"
 * Output: 5
 * Explanation: The last word is "World" with length 5.
 *
 *
 * Example 2:
 * Input: s = "   fly me   to   the moon  "
 * Output: 4
 * Explanation: The last word is "moon" with length 4.
 *
 *
 * Example 3:
 * Input: s = "luffy is still joyboy"
 * Output: 6
 * Explanation: The last word is "joyboy" with length 6.
 */

import java.util.Scanner;

public class Problem29 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the string");
        String a=obj.nextLine();
        String[] arr=a.split(" ");
        System.out.println(arr[arr.length-1].length());
    }
}
