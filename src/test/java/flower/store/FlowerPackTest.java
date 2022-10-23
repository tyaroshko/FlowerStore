package flower.store;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Random;

public class FlowerPackTest {
    private static final Random RANDOM_GENERATOR = new Random();
    private static final int MAX_QUANTITY = 1000;
    private static final int MAX_PRICE = 100;
    private static final int PRICE = 3;
    private static final int BIGGER_PRICE = 500;
    private static final int SIZE = 2;
    private static final int SMALLER_PRICE = 0;

    private static final int SEPAL_LENGTH = 10;
    private static final int QUANTITY = 10;

    private FlowerBucket flowerBucket = new FlowerBucket();
    private FlowerBucket anotherflowerBucket = new FlowerBucket();

    private Store store =  new Store();

    @BeforeEach
    public void init() {
        Flower rose = new Rose(PRICE, SEPAL_LENGTH);
        Flower tulip = new Tulip(PRICE, SEPAL_LENGTH);
        Flower chamomile = new Chamomile(PRICE, SEPAL_LENGTH);
        FlowerPack firstFlowerPack = new FlowerPack(rose, QUANTITY);
        FlowerPack secondFlowerPack = new FlowerPack(tulip, QUANTITY);
        FlowerPack thirdFlowerPack = new FlowerPack(chamomile, QUANTITY);
        flowerBucket.add(firstFlowerPack);
        flowerBucket.add(secondFlowerPack);
        FlowerBucket anotherFlowerBucket = new FlowerBucket();
        anotherFlowerBucket.add(thirdFlowerPack);
        store.add(flowerBucket);
        store.add(anotherFlowerBucket);
    }

    @Test
    public void testSearch() {
        ArrayList<FlowerBucket> result =
                store.search(SMALLER_PRICE, BIGGER_PRICE);

        Assertions.assertEquals(SIZE, result.size());
    }

}
