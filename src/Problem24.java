/**
 * Example 1:
 * Input: nums = [1,3,5,6], target = 5
 * Output: 2
 *
 * Example 2:
 * Input: nums = [1,3,5,6], target = 2
 * Output: 1
 *
 * Example 3:
 * Input: nums = [1,3,5,6], target = 7
 * Output: 4
 */

import java.util.Scanner;

public class Problem24 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the length ");
        int n=obj.nextInt();
        System.out.println("enter the data");
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=obj.nextInt();
        }
        System.out.println("enter the target number ");
        int x=obj.nextInt();
        int flag=0;
        for(int i=0;i<n-1;i++)
        {
            System.out.println("loop");
            if(a[i]<x&&a[i+1]>=x)
            {
                System.out.println( "the target location is "+(i+1));
                flag++;
                break;
            }
        }
        if(flag==0&&a[n-1]<x)
        {
            System.out.println("the target location is  "+n);
        }
        if((flag==0&&a[0]>x))
        {
            System.out.println("the target location is 0");
        }

    }
}
