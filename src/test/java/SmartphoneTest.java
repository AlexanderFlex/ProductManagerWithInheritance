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

 @Test
    public void matchesTestIfInName(){
        Smartphone product = new Smartphone(23,"Readme 4x", 10000, "Xiaomi");

        boolean expected = true;
        boolean actual = product.matches("Readme");
    }

    @Test
    public void matchesTestIfInProducer(){
        Smartphone product = new Smartphone(23,"Readme 4x", 10000, "Xiaomi");

        boolean expected = true;
        boolean actual = product.matches("Xiaomi");
    }

    @Test
    public void matchesTestIfNoNameNoProducer(){
        Smartphone product = new Smartphone(23,"Readme 4x", 10000, "Xiaomi");

        boolean expected = false;
        boolean actual = product.matches("Peach");
    }

}