/**
 * Example 1:
 *
 * Input: x = 123
 * Output: 321
 * Example 2:
 *
 * Input: x = -123
 * Output: -321
 * Example 3:
 *
 * Input: x = 120
 * Output: 21
 */


import java.util.Scanner;

public class Problem15 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the number");
        int a=obj.nextInt();
        System.out.println(a);
        int rev=0,s;
        while(a!=0)
        {
            s=a%10;
            rev=s+(10*rev);
            a=a/10;
        }
        System.out.println("reverse number is "+rev);
    }
}
