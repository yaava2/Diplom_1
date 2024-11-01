package praktikum;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BunTest {

    @Test
    public void getNameTest() {
        String name="sdc";
        float price= 27.5f;
        Bun bun = new Bun(name, price);
        String result = bun.getName();
        assertEquals(name,result);
    }

    @Test
    public void getPriceTest() {
        String name="sdc";
        float price= 27.5f;
        Bun bun = new Bun(name, price);
        float result = bun.getPrice();
        assertEquals(price,result, 0);
    }
}
