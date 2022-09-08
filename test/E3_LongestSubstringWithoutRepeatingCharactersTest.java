import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class E3_LongestSubstringWithoutRepeatingCharactersTest {

    E3_LongestSubstringWithoutRepeatingCharacters counter = new E3_LongestSubstringWithoutRepeatingCharacters();

    @Test
    void example1() {
        assertEquals(3, counter.lengthOfLongestSubstring("abcabcbb"));
    }

    @Test
    void example2() {
        assertEquals(1, counter.lengthOfLongestSubstring("bbbbb"));
    }

    @Test
    void example3() {
        assertEquals(3, counter.lengthOfLongestSubstring("pwwkew"));
    }

    @Test
    void allSymbols() {
        assertEquals(7, counter.lengthOfLongestSubstring("nd--fii#$13z5"));
    }

    @Test
    void allSymbolsShorterOddBegin() {
        assertEquals(3, counter.lengthOfLongestSubstring("ab--c"));
    }
    @Test
    void allSymbolsShorterOddEnd() {
        assertEquals(3, counter.lengthOfLongestSubstring("a--bc"));
    }

    @Test
    void allSymbolsShorterEven() {
        assertEquals(2, counter.lengthOfLongestSubstring("a--b"));
    }

    @Test
    void wrongAnswer1() {
        assertEquals(3, counter.lengthOfLongestSubstring("dvdf"));
    }

    @Test
    void wrongAnswer2() {
        assertEquals(1, counter.lengthOfLongestSubstring(" "));
    }

    @Test
    void wrongAnswer3() {
        assertEquals(5, counter.lengthOfLongestSubstring("anviaj"));
    }

    @Test
    void wrongAnswer4() {
        assertEquals(3, counter.lengthOfLongestSubstring("aabaab!bb"));
    }
}
