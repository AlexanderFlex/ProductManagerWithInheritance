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

    @Test
    public void matchesTestIfInName(){
        Book product = new Book(1, "Neznayka in Solar Sity", 200, "Носов");

        boolean expected = true;
        boolean actual = product.matches("Neznayka");
    }

    @Test
    public void matchesTestIfInAuthor(){
        Book product = new Book(1, "Neznayka in Solar Sity", 200, "Носов");

        boolean expected = true;
        boolean actual = product.matches("Носов");
    }

    @Test
    public void matchesTestIfNoNameNoAuthor(){
        Book product = new Book(1, "Neznayka in Solar Sity", 200, "Носов");

        boolean expected = false;
        boolean actual = product.matches("Bublik");
    }

}
