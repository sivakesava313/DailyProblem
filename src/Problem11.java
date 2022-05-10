/**
 * Input: l1 = [2,4,3], l2 = [5,6,4]
 * Output: [7,0,8]
 * Explanation: 342 + 465 = 807.
 * Example 2:
 *
 * Input: l1 = [0], l2 = [0]
 * Output: [0]
 * Example 3:
 *
 * Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
 * Output: [8,9,9,9,0,0,0,1]
 */

import java.util.Scanner;

public class Problem11 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the length of the 1st list");
        int n=obj.nextInt();
        System.out.println("enter the 1st list ");
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=obj.nextInt();
        }
        System.out.println("enter the length of the 2nd list");
        int m=obj.nextInt();
        System.out.println("enter the 2nd list ");
        int b[]=new int[m];
        for(int i=0;i<m;i++)
        {
            b[i]=obj.nextInt();
        }
        int[] c;
        if(n>m)
        {
            c=new int[n+1];
        }
        else
        {
            c=new int[m+1];
        }
        logic(a,b,c,n,m);
    }
    private static void logic(int[] a, int[] b, int[] c, int n, int m) {
        int i,barrow;
        i=barrow=0;
        for(i=0;i<n&&i<m;i++)
        {
            int temp=a[i]+b[i]+barrow;
            if(temp>=10)
            {
                temp=temp%10;
                barrow=1;
            }
            else {
                barrow=0;
            }
            c[i]=temp;
        }
        while(i<n||i<m)
        {
            if(i<n) {
                int temp = a[i] + barrow;
                if (temp >= 10) {
                    temp = temp % 10;
                    barrow = 1;
                } else {
                    barrow = 0;
                }
                c[i] = temp;
                i++;
            }
            else {
                int temp = b[i] + barrow;
                if (temp >= 10) {
                    temp = temp % 10;
                    barrow = 1;
                } else {
                    barrow = 0;
                }
                c[i] = temp;
                i++;

            }
        }
        if(barrow==1)
        {
            c[i]=1;
        }
        System.out.println("output");
        for(int j=0;j<n+1;j++)
        {
            System.out.println(c[j]);
        }
    }
}
