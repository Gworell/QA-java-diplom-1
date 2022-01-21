package praktikum;

import org.junit.Test;
import static org.junit.Assert.*;

public class IngredientTest {

    private String name = "hot sauce";
    private float price = 100F;
    Ingredient ingredient = new Ingredient(IngredientType.SAUCE, name, price);

    @Test
    public void getPriceCorrectPricePositiveTest() {
        float expected = 100F;
        float actual = ingredient.getPrice();
        assertEquals(expected, actual, 0.0F);
    }

    @Test
    public void getNameCorrectNamePositiveTest() {
        String expected = "hot sauce";
        String actual = ingredient.getName();
        assertEquals(expected, actual);
    }

    @Test
    public void getTypeIngredientPositiveTest() {
        IngredientType expected = IngredientType.SAUCE;
        IngredientType actual = ingredient.getType();
        assertEquals(expected, actual);
    }
}