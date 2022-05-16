/**
 * Example 1:
 *
 * Input: nums = [1,1,2]
 * Output: 2, nums = [1,2,_]
 * Explanation: Your function should return k = 2, with
 * the first two elements of nums being 1 and 2
 * respectively.
 * It does not matter what you leave beyond the returned k
 * (hence they are underscores).
 * Example 2:
 *
 * Input: nums = [0,0,1,1,1,2,2,3,3,4]
 * Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
 * Explanation: Your function should return k = 5, with
 * the first five elements of nums being 0, 1, 2, 3, and
 * 4 respectively.
 * It does not matter what you leave beyond the returned
 * k (hence they are underscores).
 */

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Problem21 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the size of list");
        int n=obj.nextInt();
        System.out.println("enter the data");
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]= obj.nextInt();
        }
        Set<Integer> optimal=new HashSet<>();
        for(int i=0;i<n;i++)
        {
            optimal.add(a[i]);
        }
        int b[]=new int[optimal.size()];
        int i=0;
        for (Integer x:optimal) {
            b[i]=x;
            i++;
        }
        System.out.println("the final list is   ");
        for(int j=0;j< optimal.size();j++)
        {
            System.out.print(b[j]+",");
        }
        for(int j=optimal.size();j<n ;j++)
        {
            System.out.print("_,");
        }


    }
}
