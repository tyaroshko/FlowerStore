package flower.store;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private final List<FlowerBucket> flowerBuckets = new ArrayList<>();

    public Store() {

    }

    public void add(FlowerBucket flowerBucket) {
        flowerBuckets.add(flowerBucket);
    }

    public ArrayList<FlowerBucket> search(double minPrice, double maxPrice) {
        ArrayList<FlowerBucket> result = new ArrayList<>();
        for (FlowerBucket flowerBucket : flowerBuckets) {
            if (flowerBucket.getPrice()
                    >= minPrice && flowerBucket.getPrice() <= maxPrice) {
                result.add(flowerBucket);
                break;
            }
        }
        return result;
    }
}
