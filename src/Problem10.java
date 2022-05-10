/**
 * Example 1:
 *
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 * Example 2:
 *
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 * Example 3:
 *
 * Input: nums = [3,3], target = 6
 * Output: [0,1]
 */

import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int flag=0;
        System.out.println("enter the lenght of the list");
        int n=obj.nextInt();
        System.out.println("Enter the list");
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=obj.nextInt();
        }
        System.out.println("enter the target element");
        int target=obj.nextInt();
        System.out.print("{");
        for(int i=0;i<n;i++)
        {
            int temp=target-a[i];
            for(int j=0;j<n;j++)
            {
                if(temp==a[j]&&i!=j)
                {
                    System.out.print("["+i+","+j+"]");
                    flag++;
                }
            }
            if(flag==1)
            {
                break;
            }
        }
        System.out.print("}");
    }
}
