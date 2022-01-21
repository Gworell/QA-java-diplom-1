package praktikum;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class BurgerTest {

    Database database = new Database();

    @Mock
    Bun bunWithMock;

    @Test
    public void setBunsPositiveTest() {
        Burger burger = new Burger();
        burger.setBuns(bunWithMock);
        assertEquals(bunWithMock, burger.bun);
    }

    @Test
    public void checkCorrectAddIngredientTest() {
        Burger burger = new Burger();
        burger.addIngredient(database.availableIngredients().get(1));
        assertEquals(1,burger.ingredients.size());
    }

    @Test
    public void correctRemoveIngredientTest() {
        Burger burger = new Burger();
        burger.addIngredient(database.availableIngredients().get(1));
        burger.removeIngredient(0);
       assertEquals(0, burger.ingredients.size());
    }

    @Test
    public void correctMovementIngredientTest() {
        Burger burger = new Burger();
        Ingredient firstIngredient = database.availableIngredients().get(0);
        Ingredient secondIngredient = database.availableIngredients().get(1);
        burger.addIngredient(firstIngredient);
        burger.addIngredient(secondIngredient);
        burger.moveIngredient(1,0);
        assertEquals(secondIngredient, burger.ingredients.get(0));
    }

    @Test
    public void checkCorrectPriceTest() {
        Burger burger = new Burger();
        burger.setBuns(bunWithMock);
        Mockito.when(bunWithMock.getPrice()).thenReturn(200F);
        burger.addIngredient(database.availableIngredients().get(1));
        float expected = 600F;
        assertEquals(expected, burger.getPrice(), 0.0F);
    }

    @Test
    public void checkReceiptPositiveTest() {
        Burger burger = new Burger();
        burger.setBuns(database.availableBuns().get(1));
        burger.addIngredient(database.availableIngredients().get(1));
        assertTrue(burger.getReceipt().contains(database.availableBuns().get(1).getName())
                &burger.getReceipt().contains(database.availableIngredients().get(1).getName()));

    }
}