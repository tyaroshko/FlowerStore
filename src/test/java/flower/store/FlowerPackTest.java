package flower.store;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Random;
import java.util.Stack;

public class FlowerPackTest {
    private static final Random RANDOM_GENERATOR = new Random();
    private static final int MAX_QUANTITY = 1000;
    private static final int MAX_PRICE = 100;

    private FlowerBucket flowerBucket;
    private Store store;

    @BeforeEach
    public void init() {
        Store store = new Store();
        FlowerBucket flowerBucket = new FlowerBucket();
        Flower rose = new Rose(3, 10);
        Flower tulip = new Tulip(3, 10);
        Flower chamomile = new Chamomile(3, 10);
        flowerBucket.add(new FlowerPack(rose, 10));
        flowerBucket.add(new FlowerPack(tulip, 10));
        FlowerBucket flowerBucket2 = new FlowerBucket();
        flowerBucket2.add(new FlowerPack(chamomile, 10));
        store.add(flowerBucket);
        store.add(flowerBucket2);
    }

    @Test
    public void testSearch() {
        ArrayList<FlowerBucket> result = store.search(10, 20);

        Assertions.assertEquals(3, result.size());
    }

}
