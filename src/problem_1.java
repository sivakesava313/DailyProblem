import java.util.Scanner;
/**This problem was asked by Uber.

 Given an array of integers, return a new
 array such that each element at index i of
 the new array is the product of all the numbers
 in the original array except the one at i.

 For example, if our input was [1, 2, 3, 4, 5],
 the expected output would be [120, 60, 40, 30, 24].
 If our input was [3, 2, 1], t
 he expected output would be [2, 3, 6].
 *
 */
public class problem_1 {
    public static void main(String[] args) {
        System.out.println("enter the length of the array");
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int a[]=new int[n];
        System.out.println("enter the list :");
        int totalmul=1;
        for(int i=0;i<n;i++)
        {
            a[i]=obj.nextInt();
            totalmul=totalmul*a[i];
        }
        System.out.println("the final list is :-");
        for(int i=0;i<n;i++)
        {
            System.out.println(totalmul/a[i]);
        }

}}
