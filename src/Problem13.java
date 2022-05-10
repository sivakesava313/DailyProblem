/**
 * Input: nums1 = [1,3], nums2 = [2]
 * Output: 2.00000
 * Explanation: merged array = [1,2,3] and median is 2.
 * Example 2:
 *
 * Input: nums1 = [1,2], nums2 = [3,4]
 * Output: 2.50000
 * Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
 */

import java.util.Arrays;
import java.util.Scanner;

public class Problem13 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the length of the 1st list");
        int n=obj.nextInt();
        System.out.println("enter the list");
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=obj.nextInt();
        }
        System.out.println("enter the length of the 2nd list");
        int m=obj.nextInt();
        System.out.println("enter the list");
        int b[]=new int[m];
        for(int i=0;i<m;i++)
        {
            b[i]=obj.nextInt();
        }
        int temp1=n+m;
        int[] c=new int[temp1];
        for(int i=0;i<n;i++)
        {
            c[i]=a[i];
        }
        for(int i=n;i<(m+n);i++)
        {
            c[i]=b[i-n];
        }

        Arrays.sort(c);

        for(int i : c){
            System.out.print(i + " ");
        }
        if((n+m)%2==0)
        {
            float temp=(c[(n+m)/2]+c[((n+m)/2)-1])/2;
            System.out.println("the median of the list is"+temp);
        }
        else {
            System.out.println("the median of the list is "+c[(n+m)/2]);
        }
    }
}
