package praktikum;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import static org.junit.Assert.assertEquals;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class BurgerTest {
    @Mock
    Bun bun;

    @Test
    public void setBuns() {
        Burger burger = new Burger();
        burger.setBuns(bun);
        assertEquals(bun, burger.bun);
    }

    @Test
    public void addIngredient() {
        Ingredient ingredient= new Ingredient(IngredientType.SAUCE, "", 0.1f);
        Burger burger = new Burger();
        burger.addIngredient(ingredient);
        assertEquals(burger.ingredients, List.of(ingredient));
    }

    @Test
    public void removeIngredient() {
        Ingredient ingredient= new Ingredient(IngredientType.SAUCE, "", 0.1f);
        Burger burger = new Burger();
        int index = 0;
        burger.addIngredient(ingredient);
        burger.removeIngredient(index);
        assertEquals(burger.ingredients, List.of());
    }

    @Test
    public void moveIngredient() {
        Ingredient ingredient1= new Ingredient(IngredientType.SAUCE, "1", 0.1f);
        Ingredient ingredient2= new Ingredient(IngredientType.SAUCE, "2", 0.1f);
        Burger burger = new Burger();
        burger.addIngredient(ingredient1);
        burger.addIngredient(ingredient2);
        burger.moveIngredient(0,1);
        assertEquals(burger.ingredients, List.of(ingredient2, ingredient1));
    }

    @Test
    public void getReceipt() {
        Ingredient ingredient1= new Ingredient(IngredientType.SAUCE, "1", 0.1f);
        Burger burger = new Burger();
        burger.addIngredient(ingredient1);
        Bun bun=new Bun("d", 13f);
        burger.setBuns(bun);
        String result="(==== d ====)\r\n"+
                "= sauce 1 =\r\n"+
                "(==== d ====)\r\n"+
                "\r\n"+
                "Price: 26,100000\r\n";
        assertEquals(burger.getReceipt(), result);
    }
}