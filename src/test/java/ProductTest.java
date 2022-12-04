import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductTest {

    @Test
    public void getIdTest() {
        Product product = new Product(1, "Neznayka in Solar Sity", 200);

        int expected = 1;
        int actual = product.getId();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getCostTest() {
        Product product = new Product(1, "Neznayka in Solar Sity", 200);

        int expected = 200;
        int actual = product.getCost();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void matchesTestIfСontains(){
        Product product = new Product(1, "Neznayka in Solar Sity", 200);

        boolean expected = true;
        boolean actual = product.matches("Solar");

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void matchesTestIfNotСontains(){
        Product product = new Product(12,"Neznayka on the Moon", 200);

        boolean expected = false;
        boolean actual = product.matches("Solar");

        Assertions.assertEquals(expected,actual);
    }
}
