package praktikum;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class IngredientParametrizedTest {

    private IngredientType type;

    public IngredientParametrizedTest(IngredientType type) {
        this.type = type;

    }

    @Parameterized.Parameters
    public static Object[] getTypeData() {
        return new Object[][]{
                {IngredientType.SAUCE},
                {IngredientType.FILLING},

        };
    }

    @Test
    public void getTypeAllIngredientTypePositiveTest() {
        Ingredient ingredient = new Ingredient(type, "name", 0F);
        IngredientType actual = ingredient.getType();
        assertEquals(type, actual);
    }
}