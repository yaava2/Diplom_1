package praktikum;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BunTest {
    private String name="sdc";
    private float price= 27.5f;
    Bun bun = new Bun(name, price);

    @Test
    public void getNameTest() {
        String result = bun.getName();
        assertEquals(name,result);
    }

    @Test
    public void getPriceTest() {
        float result = bun.getPrice();
        assertEquals(price,result, 0);
    }
}
