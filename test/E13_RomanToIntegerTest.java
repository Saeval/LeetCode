import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class E13_RomanToIntegerTest {

    private E13_RomanToInteger converter = new E13_RomanToInteger();

    @ParameterizedTest
    @ValueSource(strings = { "Ciao", "#", "è" })
    void throwIfLettersNotInAlphabet(String invalidValue){
        assertThrows(IllegalArgumentException.class, () -> converter.romanToInt(invalidValue));
    }

    @Test
    void basicAlphabet() {
        assertEquals(1, converter.romanToInt("I"));
        assertEquals(5, converter.romanToInt("V"));
        assertEquals(10, converter.romanToInt("X"));
        assertEquals(50, converter.romanToInt("L"));
        assertEquals(100, converter.romanToInt("C"));
        assertEquals(500, converter.romanToInt("D"));
        assertEquals(1000, converter.romanToInt("M"));
    }

    @Test
    void twoSameNumbersRepeated(){
        assertEquals(2, converter.romanToInt("II"));
        assertEquals(20, converter.romanToInt("XX"));
        assertEquals(200, converter.romanToInt("CC"));
        assertEquals(2000, converter.romanToInt("MM"));
    }

    @Test
    void smallerNumberBeforeBiggerMeansSubtract(){
        assertEquals(4, converter.romanToInt("IV"));
        assertEquals(9, converter.romanToInt("IX"));
        assertEquals(40, converter.romanToInt("XL"));
        assertEquals(90, converter.romanToInt("XC"));
    }

    @Test
    void combined(){
        assertEquals(13, converter.romanToInt("XIII"));
        assertEquals(19, converter.romanToInt("XIX"));
        assertEquals(29, converter.romanToInt("XXIX"));
        assertEquals(1992, converter.romanToInt("MCMXCII"));
    }

    @Test
    void example1(){
        assertEquals(3, converter.romanToInt("III"));
    }

    @Test
    void example2(){
        assertEquals(58, converter.romanToInt("LVIII"));
    }

    @Test
    void example3(){
        assertEquals(1994, converter.romanToInt("MCMXCIV"));
    }
}
