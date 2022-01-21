package praktikum;

import org.junit.Test;
import static org.junit.Assert.*;

public class BunTest {
    private String name = "black bun";
    private float price = 100F;
    Bun bun = new Bun(name, price);

    @Test
    public void getNameCorrectNamePositiveTest() {
        String expected = "black bun";
        String actual = bun.getName();
        assertEquals(expected, actual);
    }

    @Test
    public void getPriceCorrectPricePositiveTest() {
        float expected = 100F;
        float actual = bun.getPrice();
        assertEquals(expected, actual, 0.0F);
    }
}