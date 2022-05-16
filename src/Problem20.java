/**Merge the two lists in a one sorted list. The list should be made by splicing
 * together the nodes of the first two lists.
 * Example 1:
 * Input: list1 = [1,2,4], list2 = [1,3,4]
 * Output: [1,1,2,3,4,4]
 *
 * Example 2:
 * Input: list1 = [], list2 = []
 * Output: []
 *
 * Example 3:
 * Input: list1 = [], list2 = [0]
 * Output: [0]
 *
 */

import java.util.Scanner;

public class Problem20 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the size of 1st list ");
        int n=obj.nextInt();
        System.out.println("enter the elements of the 1st array ");
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=obj.nextInt();
        }
        System.out.println("enter the size of 2nd list ");
        int m=obj.nextInt();
        System.out.println("enter the elements of the 2nd array ");
        int b[]=new int[m];
        for(int i=0;i<m;i++)
        {
            b[i]=obj.nextInt();
        }
        int[] c=new int[n+m];
        int i,j,count=0;
        for(i=0,j=0;i<n&&j<m;)
        {
            if(a[i]<=b[j])
            {
                c[count]=a[i];
                i++;
                count++;
            }
            else
            {
                c[count]=b[j];
                count++;
                j++;
            }
        }
        while(i<n)
        {
            c[count]=a[i];
            count++;
            i++;
        }
        while (j<m)
        {
            c[count]=b[j];
            count++;
            j++;
        }
        System.out.println("the sorted list is ");
        for(int x=0;x<n+m;x++)
        {
            System.out.println(c[x]);
        }

    }
}
