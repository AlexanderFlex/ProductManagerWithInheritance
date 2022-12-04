import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProductManagerTest {
    ProductRepository repo = new ProductRepository();
    ProductManager manager = new ProductManager(repo);
    Product item1 = new Product(1,"Neznayka in Solar Sity", 200);
    Product item2 = new Product(12,"Neznayka on the Moon", 200);
    Product item3 = new Product(23,"Readme 4x", 10000);
    Product item4 = new Product(34,"Iphone14", 50000);
    Product item5 = new Product(42,"War and peace", 500);
    Product item6 = new Product(54,"Realme 8 pro", 25000);

    @BeforeEach
    public void setup(){
        manager.add(item1);
        manager.add(item2);
        manager.add(item3);
        manager.add(item4);
        manager.add(item5);
        manager.add(item6);
    }
    /// Непонятно почему не работает добавление через @BeforeEach

    @Test
    public void testAdd(){

        Product[] expected = {item1, item2, item3, item4, item5, item6};
        Product[] actual = repo.getItems();

        Assertions.assertArrayEquals(expected,actual);
    }

    @Test
    public void testSearhSeveral(){

        Product[] expected = {item1, item2};
        Product[] actual = manager.searchBy("Neznayka");

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void testSearhOne() {

        Product[] expected = {item3};
        Product[] actual = manager.searchBy("Readme");

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testSearhNoOne() {

        Product[] expected = {};
        Product[] actual = manager.searchBy("Earth");

        Assertions.assertArrayEquals(expected, actual);
    }

}
