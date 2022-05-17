/**
 * Example 1:
 * Input: candidates = [2,3,6,7], target = 7
 * Output: [[2,2,3],[7]]
 * Explanation:
 * 2 and 3 are candidates, and 2 + 2 + 3 = 7. Note that 2 can be used multiple times.
 * 7 is a candidate, and 7 = 7.
 * These are the only two combinations.
 *
 *
 * Example 2:
 * Input: candidates = [2,3,5], target = 8
 * Output: [[2,2,2,2],[2,3,3],[3,5]]
 *
 *
 * Example 3:
 * Input: candidates = [2], target = 1
 * Output: []
 */

import java.util.*;

public class Problem25 {
            static ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> arr, int sum)
            {
                ArrayList<ArrayList<Integer> > ans = new ArrayList<>();
                ArrayList<Integer> temp = new ArrayList<>();
                Set<Integer> set = new HashSet<>(arr);
                arr.clear();
                arr.addAll(set);
                Collections.sort(arr);
                findNumbers(ans, arr, sum, 0, temp);
                return ans;
            }
            static void
            findNumbers(ArrayList<ArrayList<Integer> > ans, ArrayList<Integer> arr, int sum, int index, ArrayList<Integer> temp)
            {
                if (sum == 0) {
                    ans.add(new ArrayList<>(temp));
                    return;
                }

                for (int i = index; i < arr.size(); i++) {
                    if ((sum - arr.get(i)) >= 0) {
                        temp.add(arr.get(i));
                        findNumbers(ans, arr, sum - arr.get(i), i, temp);
                        temp.remove(arr.get(i));
                    }
                }
            }
            public static void main(String[] args)
            {
                ArrayList<Integer> arr = new ArrayList<>();
                Scanner obj=new Scanner(System.in);
                System.out.println("enter the size of the data");
                int n=obj.nextInt();
                System.out.println("enter the data");
                for(int i=0;i<n;i++)
                {
                    int a=obj.nextInt();
                    arr.add(a);
                }
                System.out.println("enter the sum  element  ");
                int sum = obj.nextInt();
                ArrayList<ArrayList<Integer>> ans= combinationSum(arr, sum);
                if (ans.size() == 0) {
                    System.out.println("Empty");
                    return;
                }
                for (int i = 0; i < ans.size(); i++) {
                    System.out.print("(");
                    for (int j = 0; j < ans.get(i).size(); j++) {
                        System.out.print(ans.get(i).get(j) + " ");
                    }
                    System.out.print(") ");
                }
            }



}
