package OOP.w_1;

public class HotDrink extends Drink {
    private int tempurature;

    public HotDrink(String name, int volume, int price, int tempurature) {

        super(name, volume, price);
        this.tempurature = tempurature;

    }

    @Override
    public String toString() {
        return super.toString() + "HotDrink [tempurature = " + tempurature + "]";
    }

    public int getTempurature() {
        return tempurature;
    }

}