/**
 * Prior to being passed to your function, nums is
 * possibly rotated at an unknown pivot index k
 * (1 <= k < nums.length) such that the resulting array
 * is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1]
 * , ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7]
 * might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].
 *
 * Example 1:
 * Input: nums = [4,5,6,7,0,1,2], target = 0
 * Output: 4
 *
 * Example 2:
 * Input: nums = [4,5,6,7,0,1,2], target = 3
 * Output: -1
 *
 * Example 3:
 * Input: nums = [1], target = 0
 * Output: -1
 */

import java.util.Scanner;

public class Problem22 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the size of the list  ");
        int n=obj.nextInt();
        System.out.println("enter the data into the list");
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=obj.nextInt();
        }
        System.out.println("enter the target element");
        int x=obj.nextInt();
        int flag=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]==x)
            {
                System.out.println("it takes "+i+"  iterations");
                flag++;
                break;
            }
        }
        if(flag==0)
        {
            System.out.println("it takes -1 iterations");
        }
    }
}
