import java.util.*;

public class E13_RomanToInteger {

    private final HashMap<Character, Integer> alphabet = new HashMap<>();

    public E13_RomanToInteger(){
        alphabet.put('I', 1);
        alphabet.put('V', 5);
        alphabet.put('X', 10);
        alphabet.put('L', 50);
        alphabet.put('C', 100);
        alphabet.put('D', 500);
        alphabet.put('M', 1000);
    }

    public int romanToInt(String roman) {
        int result = 0;
        char[] charArray = roman.toCharArray();

        checkForInvalidCharacters(charArray);

        for (int i = 0; i < charArray.length; i++) {
            boolean isLastLetter = i == charArray.length - 1;

            char currentLetter = charArray[i];
            char nextLetter = isLastLetter ? 'I' : charArray[i+1];

            Integer next = alphabet.get(nextLetter);
            Integer current = alphabet.get(currentLetter);

            boolean nextIsBiggerThanCurrent = next > current;

            if (nextIsBiggerThanCurrent) {
                result += next - current;
                i++;
            } else {
                result += current;
            }
        }

        return result;
    }

    private void checkForInvalidCharacters(char[] roman) {
        for (char letter : roman) {
            if (!alphabet.containsKey(letter)) throw new IllegalArgumentException();
        }
    }
}
