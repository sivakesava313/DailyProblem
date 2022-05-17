/**
 * Example 1:
 * Input: nums = [5,7,7,8,8,10], target = 8
 * Output: [3,4]
 *
 *
 * Example 2:
 * Input: nums = [5,7,7,8,8,10], target = 6
 * Output: [-1,-1]
 *
 *
 * Example 3:
 * Input: nums = [], target = 0
 * Output: [-1,-1]
 */

import java.util.Scanner;

public class Problem23 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter  the length of the list");
        int n=obj.nextInt();
        System.out.println("enter the data");
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=obj.nextInt();
        }
        System.out.println("enter the target data");
        int x=obj.nextInt();
        int flag=0;
        for(int i=0;i<n;i++)
        {
            if (a[i]==x)
            {
                if(a[i+1]==x)
                {
                    System.out.println("["+i+","+(i+1)+"]");
                }
                else
                {
                    System.out.println("["+i+",-1]");
                }
                flag++;
                break;
            }
        }
        if(flag==0)
        {
            System.out.println("[-1,-1]");
        }
    }
}
