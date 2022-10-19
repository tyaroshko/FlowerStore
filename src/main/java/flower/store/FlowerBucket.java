package flower.store;

import java.util.List;

public class FlowerBucket {
    private int price;
    private List<FlowerPack> flowerPacks;

    public void add(FlowerPack flowerPack) {
        this.price += flowerPack.getPrice();
        flowerPacks.add(flowerPack);
    }

    public double getPrice() {
        return price;
    }

    // Method of Department class
//    public List<FlowerPack> getFlowerPacks()
//    {
////        // Returning list of user defined type
////        // Student type
////        return getFlowerPacks();
//    }
//}
}
