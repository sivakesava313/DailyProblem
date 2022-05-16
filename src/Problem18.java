/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 * Example 1:
 * Input: strs = ["flower","flow","flight"]
 * Output: "fl"
 *
 *
 * Example 2:
 * Input: strs = ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 */

import java.util.Arrays;
import java.util.Scanner;

public class Problem18 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the length of array :-");
        int n=obj.nextInt();
       String[] a=new String[n];
       System.out.println("enter the list");
       for(int i=0;i<n;i++)
       {
           a[i]=obj.next();
       }
       System.out.println("the common element is    "+element(a,n));

    }

    private static String element(String[] a, int n) {
        if(n==0)
        {
            return "";
        }
        if(n==1)
        {
            return a[0];
        }
        Arrays.sort(a);
        int end=Math.min(a[0].length(),a[n-1].length());
        int i;
        for(i=0;i<end&&a[0].charAt(i)==a[n-1].charAt(i);i++){
        }
        return a[0].substring(0,i);

    }
}
