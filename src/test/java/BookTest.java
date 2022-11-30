import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BookTest {

    @Test
    public void getAuthorTest() {
        Book product = new Book(1, "Neznayka in Solar Sity", 200, "Носов");

        String expected = "Носов";
        String actual = product.getAuthor();

        Assertions.assertEquals(expected, actual);
    }
}
