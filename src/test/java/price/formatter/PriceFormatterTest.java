package price.formatter;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Write your tests for the PriceFormatter here. See the specification of the
 * PriceFormatter and formatPrice method in the PriceFormatter class and the
 * readme file.
 */
public class PriceFormatterTest {

    @Test
    void TestBasicPrice() {
        PriceFormatter formatter = new PriceFormatter();

        assertEquals("3,14 €", formatter.formatPrice(3.14159));
    }


@Test
void TestThousands(){
    PriceFormatter formatter = new PriceFormatter();
    assertEquals("1 000 €", formatter.formatPrice(1000));

}

@Test 
void TestNoDecimals(){
    PriceFormatter formatter = new PriceFormatter();
    assertEquals("15 €", formatter.formatPrice(15.004));
}
@Test 
void TestLargeNumber(){
    PriceFormatter formatter = new PriceFormatter();
    assertEquals("123 456,79 €", formatter.formatPrice(123456.789));
}
@Test 
void TestNegativePrice(){
PriceFormatter formatter = new PriceFormatter();
assertEquals("-25,50 €", formatter.formatPrice(-25.50));
}

@Test 
void TestZeroPrice(){
    PriceFormatter formatter = new PriceFormatter();
    assertEquals("0 €", formatter.formatPrice(0));
}
}