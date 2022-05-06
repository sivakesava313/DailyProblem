/**
 * Given an array of integers and a number k,
 * where 1 <= k <= length of the array, compute
 * the maximum values of each subarray of length k.
 *
 * For example, given array = [10, 5, 2, 7, 8, 7]
 * and k = 3, we should get: [10, 7, 8, 8], since:
 *
 * 10 = max(10, 5, 2)
 * 7 = max(5, 2, 7)
 * 8 = max(2, 7, 8)
 * 8 = max(7, 8, 7)
 */

import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the length of the array");
        int n=obj.nextInt();
        int a[]=new int[n];
        System.out.println("enter the elements");
        for(int i=0;i<n;i++)
        {
            a[i]=obj.nextInt();
        }
        int max;
        for(int i=0;i<n;i++)
        {
            if((i+3==n+1))
            {
                break;
            }
            max=a[i];
            for(int j=i;j<i+3;j++)
            {
                if(max<a[j])
                {
                    max=a[j];
                }
            }
            System.out.println(max);
        }
    }
}
