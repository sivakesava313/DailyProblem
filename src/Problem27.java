/**
 * Given an integer array nums, find the contiguous subarray
 * (containing at least one number) which has the largest sum
 * and return its sum.
 *
 * Example 1:
 * Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
 * Output: 6
 * Explanation: [4,-1,2,1] has the largest sum = 6.
 *
 * Example 2:
 * Input: nums = [1]
 * Output: 1
 *
 * Example 3:
 * Input: nums = [5,4,-1,7,8]
 * Output: 23
 */

import java.util.Scanner;

public class Problem27 {
    public static void main (String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the size");
        int n=obj.nextInt();
        System.out.println("enter the data");
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=obj.nextInt();
        }
        System.out.println("Maximum contiguous sum is " + maxSubArraySum(a,n));
    }

    static int maxSubArraySum(int a[],int size)
    {
        int x = Integer.MIN_VALUE,y= 0;
         for (int i = 0; i < size; i++)
         {
             y= y + a[i];
             if (x < y)
                 x =y;
             if (y < 0)
                 y= 0;
         }
         return x;
    }
}


