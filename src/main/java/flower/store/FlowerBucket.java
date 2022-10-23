package flower.store;

import java.util.ArrayList;
import java.util.List;

public class FlowerBucket {
    private final List<FlowerPack> flowerPacks = new ArrayList<>();
    private int price;

    public void add(FlowerPack flowerPack) {
        this.price += flowerPack.getPrice();
        flowerPacks.add(flowerPack);
    }

    public double getPrice() {
        return price;
    }

    public List<FlowerPack> getFlowerPacks() {
        return flowerPacks;
    }
}
