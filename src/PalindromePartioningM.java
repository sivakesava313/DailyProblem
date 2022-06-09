/*
Example 1:
Input: s = "aab"
Output: [["a","a","b"],["aa","b"]]

Example 2:
Input: s = "a"
Output: [["a"]]
 */
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class PalindromePartioningM {
        public static void main(String[] args)
        {
            System.out.println("enter the string ");
            Scanner obj=new Scanner(System.in);
            String input =obj.next();
            System.out.println("All possible palindrome partitions for " + input + " are :");
            allPalPartitions(input);
        }
        private static void allPalPartitions(String input)
        {
            int n = input.length();
            ArrayList<ArrayList<String>> allPart = new ArrayList<>();
            Deque<String> currPart = new LinkedList<>();
            allPalPartitonsUtil(allPart, currPart, 0, n, input);
            for (int i = 0; i < allPart.size(); i++)
            {
                for (int j = 0; j < allPart.get(i).size(); j++)
                {
                    System.out.print(allPart.get(i).get(j) + " ");
                }
                System.out.println();
            }
        }
        private static void allPalPartitonsUtil(ArrayList<ArrayList<String>> allPart, Deque<String> currPart, int start, int n, String input)
        {
            if (start >= n)
            {
                allPart.add(new ArrayList<>(currPart));
                return;
            }
            for (int i = start; i < n; i++)
            {
                if (isPalindrome(input, start, i))
                {
                    currPart.addLast(input.substring(start, i + 1));
                    allPalPartitonsUtil(allPart, currPart, i + 1, n, input);
                    currPart.removeLast();
                }
            }
        }
        private static boolean isPalindrome(String input, int start, int i)
        {
            while (start < i)
            {
                if (input.charAt(start++) != input.charAt(i--))
                    return false;
            }
            return true;
        }
    }

