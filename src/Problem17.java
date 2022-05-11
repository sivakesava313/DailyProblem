/**
 * Example 1:
 * Input: height = [1,8,6,2,5,4,8,3,7]
 * Output: 49
 * Explanation: The above vertical lines are represented by
 * array [1,8,6,2,5,4,8,3,7]. In this case, the max area of
 * water (blue section) the container can contain is 49.
 *
 *
 * Example 2:
 *
 * Input: height = [1,1]
 * Output: 1
 */

import java.util.Scanner;

public class Problem17 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the length of the string");
        int n=obj.nextInt();
        System.out.println("enter the list");
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=obj.nextInt();
        }
        int max=a[0];
        for(int i=0;i<n/2;i++)
        {
            for(int j=n-1;j>=n/2;j--)
            {
                if(a[i]>=a[j]) {
                    int temp = a[i] * (j - i - 1);
                    if (temp > max) {
                        max = temp;
                    }
                }
                else {
                    int temp = a[j] * (j - i - 1);
                    if (temp > max) {
                        max = temp;
                    }

                }
//                    System.out.println("j loop");
            }
        }
        System.out.println(max);
    }
}
