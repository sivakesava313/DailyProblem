import java.util.Scanner;
/**
 Given an array of integers, find the first missing positive integer in linear time and constant space.
 In other words, find the lowest positive integer that does not exist in the array.
 The array can contain duplicates and negative numbers as well.

 For example, the input [3, 4, -1, 1] should give 2. The input [1, 2, 0] should give 3.


 */
public class problem_2 {
    public static void main(String[] args) {
        System.out.println("enter the array size");
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int a[]=new int[n];
        System.out.println("enter the elements");
        for(int i=0;i<n;i++)
        {
            a[i]=obj.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                if (a[i] > a[j]) {
                    a[i]=a[i]+a[j];
                    a[j]=a[i]-a[j];
                    a[i]=a[i]-a[j];
                }
            }
        }
        int temp=a[0];
        int flag=0;
        for(int i=0;i<n;i++)
        {

            if(a[i]!=temp)
            {
                if(temp==0)
                {
                    temp++;

                }
                else {
                    System.out.println(temp);
                    flag++;
                    break;
                }
            }

            temp++;
        }
        if (flag == 0) {

            System.out.println(temp++);
        }
    }
}
