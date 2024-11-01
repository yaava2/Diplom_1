package praktikum;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class BurgerParamTest {
    float price;
    Ingredient ingredient;
    Bun bun;

    public BurgerParamTest(float price, Ingredient ingredient, Bun bun){
        this.price=price;
        this.ingredient=ingredient;
        this.bun = bun;
    }

    @Parameterized.Parameters
    public static Object[][] dataGenerator() {
        return new Object[][] {
                { 3f, new Ingredient(IngredientType.SAUCE, "",1f), new Bun("",1f) },
                { 6f, new Ingredient(IngredientType.SAUCE, "",2f), new Bun("",2f) },
        };
    }

    @Test
    public void getPriceTest(){
        Burger burger = new Burger();
        burger.setBuns(bun);
        burger.addIngredient(ingredient);

        float result = burger.getPrice();

        Assert.assertEquals(price, result, 0f);

    }

}
