/**
 * example 1:-
 *   input:- ravi098kumar
 *   output:- 098
 *
 * example 2:-
 *   input:- shushan12332
 *   output:- 12332
 */

import java.util.Scanner;

public class Problem16 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the string");
        String a=obj.next();
        StringBuilder x=new StringBuilder();
        for(int i=0;i<a.length();i++)
        {
            if(Character.isDigit(a.charAt(i)))
            {
                x.append(a.charAt(i));
            }
        }
        System.out.println("the digits is "+x);
    }
}
