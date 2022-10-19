package flower.store;

import lombok.Getter;
import lombok.Setter;



@Setter
public class Flower {
    @Getter
    private double sepalLength;
    private FlowerColor color;
    @Getter
    private double price;
    @Getter
    private FlowerType flowerType;

    public Flower() {}

    public Flower(FlowerColor color, int price, int sepalLength){
        this.color = color;
        this.price = price;
        this.sepalLength = sepalLength;
    }

    public Flower(FlowerColor color, int price) {
        this.color = color;
        this.price = price;
    }

    public String getColor() {
        return color.toString();
    }
}
