import java.nio.charset.StandardCharsets;
/**
 * Implement an autocomplete system. That is, given a query string s and
 * a set of all possible query strings, return all strings in the set that have s as a prefix.
 *
 * For example, given the query string de and the set of strings [dog, deer, deal], return [deer, deal].
 */
import java.util.Scanner;

public class Dcp4 {
        public static void main(String[] args) {
            Scanner obj=new Scanner(System.in);
            System.out.println("enter the number of strings you have to enter");
            int n=obj.nextInt();
            String[] a=new String[n];
            System.out.println("enter the strings");
            for(int i=0;i<n;i++)
            {
                a[i]=obj.next();
            }
            System.out.println("enter the sub string to compare");
            String target=obj.next();
            int leng=target.length();
            System.out.println("the sub string elements are");
            for(int i=0;i<n;i++)
            {
                if(target.equalsIgnoreCase(a[i].substring(0,leng)))
                {
                    System.out.println(a[i]);
                }
            }
        }
}
