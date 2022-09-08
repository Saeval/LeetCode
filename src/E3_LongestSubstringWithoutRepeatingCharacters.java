import java.util.ArrayList;
import java.util.List;

public class E3_LongestSubstringWithoutRepeatingCharacters {

    // Sliding window solution
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 1) return 1;

        List<Character> seen = new ArrayList<>();
        int result = 0;

        char[] charArray = s.toCharArray();

        for (char letter : charArray) {
            if (!seen.contains(letter)) {
                seen.add(letter);
            }
            else {
                result = Math.max(result, seen.size());
                seen = removeAllBefore(letter, seen);
                seen.add(letter);
            }
        }

        return Math.max(result, seen.size());
    }

    // Naive solution
//    public int lengthOfLongestSubstring(String s) {
//        if (s.length() == 1) return 1;
//
//        int longestSoFar = 0;
//
//        for (var i = 0; i < s.length() - 1; i++) {
//            var seen = new HashSet<Character>();
//            int longestCurrent = 0;
//
//            Character current = (char)s.codePointAt(i);
//            seen.add(current);
//            longestCurrent++;
//
//            for (var j = i + 1; j < s.length(); j++) {
//                Character next = (char)s.codePointAt(j);
//                if (seen.add(next)) {
//                    longestCurrent++;
//                    if (j == s.length() - 1) longestSoFar = Math.max(longestCurrent, longestSoFar);
//                }
//                else {
//                    longestSoFar = Math.max(longestCurrent, longestSoFar);
//                    break;
//                }
//            }
//        }
//
//        return longestSoFar;
//    }

    private List<Character> removeAllBefore(char letter, List<Character> seen) {
        var result = new ArrayList<Character>();
        var found = false;

        for (var current : seen) {
            if (current == letter) found = true;
            else if (found) result.add(current);
        }

        return result;

        // One-liner which apparently is slower but uses less memory
//        return seen.subList(seen.indexOf(letter) + 1, seen.size());
    }

}
