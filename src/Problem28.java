/**
 * Example 1:-
 * Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
 * Output: [[1,6],[8,10],[15,18]]
 * Explanation: Since intervals [1,3] and [2,6] overlaps, merge them into [1,6].
 *
 *
 * Example 2:
 * Input: intervals = [[1,4],[4,5]]
 * Output: [[1,5]]
 * Explanation: Intervals [1,4] and [4,5] are considered overlapping.
 */

import java.util.Scanner;

public class Problem28 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the number of intervels");
        int n=obj.nextInt();
        System.out.println("enter the intervals list");
        int a[][]=new int[n][2];
        for(int i=0;i<n;i++)
        {
            System.out.println("enter the "+(i+1)+ "pair");
            a[i][0]=obj.nextInt();
            a[i][1]= obj.nextInt();
        }
        int flag,temp;
        for(int i=0;i<n;i++)
        {
            flag=a[i][1];
            temp=i;
            for(int j=i+1;j<n;j++)
            {
                if(a[i][1]>=a[j][0])
                {
                    flag=a[j][1];
                    temp=i+j;
                }
            }
            System.out.println("["+a[i][0]+","+flag+"]");
            i=temp;
        }

    }
}
