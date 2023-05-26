import org.example.DecimalToRoman;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DecimalToRomanTest {

    @Test
    public void testDecimalToRoman() {
        Assertions.assertEquals("I", DecimalToRoman.decimalToRoman(1));
        Assertions.assertEquals("X", DecimalToRoman.decimalToRoman(10));
        Assertions.assertEquals("VII", DecimalToRoman.decimalToRoman(7));
        Assertions.assertEquals("MCMXLIX", DecimalToRoman.decimalToRoman(1949));
        Assertions.assertEquals("MMXVIII", DecimalToRoman.decimalToRoman(2018));
    }

    @Test
    public void testDecimalToRomanWithZero() {
        Assertions.assertEquals("", DecimalToRoman.decimalToRoman(0));
    }

    @Test
    public void testDecimalToRomanWithInvalidInput() {
        Assertions.assertEquals("", DecimalToRoman.decimalToRoman(-10));
        Assertions.assertEquals("", DecimalToRoman.decimalToRoman(5000));
    }
}

