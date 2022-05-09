/**
 * Given a dictionary of words and a string made up of those words (no spaces), return the original sentence in a list.
 * If there is more than one possible reconstruction, return any of them. If there is no possible reconstruction, then
 * return null.
 *
 * For example, given the set of words 'quick', 'brown', 'the', 'fox', and the
 * string "thequickbrownfox", you should return ['the', 'quick', 'brown', 'fox'].
 *
 * Given the set of words 'bed', 'bath', 'bedbath', 'and', 'beyond', and the
 * string "bedbathandbeyond", return either ['bed', 'bath', 'and', 'beyond] or
 * ['bedbath', 'and', 'beyond'].
 */

import java.util.Arrays;
import java.util.List;

class Problem7
{
    public static void wordBreak(List<String> dict, String word, String out)
    {
        if (word.length() == 0)
        {
            System.out.println(out);
            return;
        }

        for (int i = 1; i <= word.length(); i++)
        {
            String prefix = word.substring(0, i);
            if (dict.contains(prefix)) {
                wordBreak(dict, word.substring(i), out + " " + prefix);
            }
        }
    }
    public static void main(String[] args)
    {
        List<String> dict = Arrays.asList("this", "th", "is", "famous", "Word",
                "break", "b", "r", "e", "a", "k", "br", "bre", "brea", "ak", "problem");
        String word = "Wordbreakproblem";

        wordBreak(dict, word, "");
    }
}
