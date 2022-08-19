import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class E12_IntegerToRomanTest {

    private final E12_IntegerToRoman converter = new E12_IntegerToRoman();

    @Test
    void basicAlphabet() {
        assertEquals("I", converter.intToRoman(1));
        assertEquals("V", converter.intToRoman(5));
        assertEquals("X", converter.intToRoman(10));
        assertEquals("L", converter.intToRoman(50));
        assertEquals("C", converter.intToRoman(100));
        assertEquals("D", converter.intToRoman(500));
        assertEquals("M", converter.intToRoman(1000));
    }

    @Test
    void twoSameNumbersRepeated(){
        assertEquals("II", converter.intToRoman(2));
        assertEquals("XX", converter.intToRoman(20));
        assertEquals("CC", converter.intToRoman(200));
        assertEquals("MM", converter.intToRoman(2000));
    }

    @Test
    void smallerNumberBeforeBiggerMeansSubtract(){
        assertEquals("IV", converter.intToRoman(4));
        assertEquals("IX", converter.intToRoman(9));
        assertEquals("XL", converter.intToRoman(40));
        assertEquals("XC", converter.intToRoman(90));
    }

    @Test
    void combined(){
        assertEquals("XIII", converter.intToRoman(13));
        assertEquals("XIX", converter.intToRoman(19));
        assertEquals("XXIX", converter.intToRoman(29));
        assertEquals("MCMXCII", converter.intToRoman(1992));
    }

    @Test
    void example1(){
        assertEquals("III", converter.intToRoman(3));
    }

    @Test
    void example2(){
        assertEquals("LVIII", converter.intToRoman(58));
    }

    @Test
    void example3(){
        assertEquals("MCMXCIV", converter.intToRoman(1994));
    }
}
