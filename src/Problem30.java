/**
 * Example 1:
 * Input: digits = [1,2,3]
 * Output: [1,2,4]
 * Explanation: The array represents the integer 123.
 * Incrementing by one gives 123 + 1 = 124.
 * Thus, the result should be [1,2,4].
 *
 *
 * Example 2:
 * Input: digits = [4,3,2,1]
 * Output: [4,3,2,2]
 * Explanation: The array represents the integer 4321.
 * Incrementing by one gives 4321 + 1 = 4322.
 * Thus, the result should be [4,3,2,2].
 *
 *
 * Example 3:
 * Input: digits = [9]
 * Output: [1,0]
 * Explanation: The array represents the integer 9.
 * Incrementing by one gives 9 + 1 = 10.
 * Thus, the result should be [1,0].
 */

import java.util.Scanner;

public class Problem30 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the length of the data");
        int n=obj.nextInt();
        System.out.println("enter the data");
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=obj.nextInt();
        }
        int sum=0;
        int flag=0;
        int i=n-1;
        do {
            sum=a[i];
            if(i==n-1)
            {
                sum=a[i]+1;
            }
            sum=sum+flag;
            if(sum==10)
            {
                a[i]=0;
                flag=1;
            }
            else
            {
                a[i]=sum;
                flag=0;
            }

            i--;
//            System.out.println(i);
        }while(flag!=0&&i>=0);
        if(flag==1)
        {
            System.out.println("1");
            for(int x:a)
            {
                System.out.println(a[x]);
            }
        }
        else
        {
            for(int x:a)
            {
                System.out.println(x);
            }

        }
    }
}
