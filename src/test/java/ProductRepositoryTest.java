import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

//import org.junit.Test;
//import org.junit.jupiter.api.Assertions;

public class ProductRepositoryTest {

    Product item1 = new Book(1,"Neznayka in Solar Sity", 200, "Носов");
    Product item2 = new Book(12,"Neznayka on the Moon", 200, "Носов");
    Product item3 = new Smartphone(23,"Readme 4x", 10000, "Xiaomi");
    Product item4 = new Smartphone(34,"Iphone14", 50000, "Apple");
    Product item5 = new Book(42,"War and peace", 500, "Tolstoy");
    Product item6 = new Smartphone(54,"Realme 8 pro", 25000, "Realme");

    @Test
    public void testSaveBooks(){
        ProductRepository repo = new ProductRepository();
        repo.save(item1);
        repo.save(item2);

        Product[] expected = {item1, item2};
        Product[] actual = repo.getItems();
        Assertions.assertArrayEquals(expected,actual);
    }

    @Test
    public void testSavePhones(){
        ProductRepository repo = new ProductRepository();
        repo.save(item3);
        repo.save(item4);

        Product[] expected = {item3, item4};
        Product[] actual = repo.getItems();
        Assertions.assertArrayEquals(expected,actual);
    }

    @Test
    public void testSavePhonesAndBooks(){
        ProductRepository repo = new ProductRepository();
        repo.save(item1);
        repo.save(item2);
        repo.save(item3);
        repo.save(item4);

        Product[] expected = {item1, item2, item3, item4};
        Product[] actual = repo.getItems();
        Assertions.assertArrayEquals(expected,actual);
    }


    @Test
    public void testDeleteBook(){
        ProductRepository repo = new ProductRepository();
        repo.save(item3);
        repo.save(item4);
        repo.save(item5);
        repo.save(item6);
        repo.removeById(item6.getId());

        Product[] expected = {item3,item4,item5};
        Product[] actual = repo.getItems();
        Assertions.assertArrayEquals(expected,actual);
    }

    @Test
    public void testDeleteById(){
        ProductRepository repo = new ProductRepository();
        repo.save(item3);
        repo.save(item4);
        repo.save(item5);
        repo.save(item6);
        repo.removeById(54);

        Product[] expected = {item3,item4,item5};
        Product[] actual = repo.getItems();
        Assertions.assertArrayEquals(expected,actual);
    }

}
