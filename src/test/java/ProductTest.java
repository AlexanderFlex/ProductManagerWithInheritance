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
}
