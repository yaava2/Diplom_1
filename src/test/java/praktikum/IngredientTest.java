package praktikum;

import org.junit.Test;

import static org.junit.Assert.*;

public class IngredientTest {
    @Test
    public void getPrice() {
        IngredientType type = IngredientType.SAUCE;
        String name="dd";
        float price=11f;
        Ingredient ingredient = new Ingredient(type, name, price);

        float result = ingredient.getPrice();
        assertEquals(price,result, 0);
    }

    @Test
    public void getName() {
        IngredientType type = IngredientType.SAUCE;
        String name="dd";
        float price=11f;
        Ingredient ingredient = new Ingredient(type, name, price);

        String result = ingredient.getName();
        assertEquals(name,result);
    }

    @Test
    public void getType() {
        IngredientType type = IngredientType.SAUCE;
        String name="dd";
        float price=11f;
        Ingredient ingredient = new Ingredient(type, name, price);

        var result = ingredient.getType();
        assertEquals(type, result);
    }

}