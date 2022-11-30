import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SmartphoneTest {
    @Test
    public void getProducerTest() {
        Smartphone product = new Smartphone(23,"Readme 4x", 10000, "Xiaomi");

        String expected = "Xiaomi";
        String actual = product.getProducer();

        Assertions.assertEquals(expected, actual);
    }
}