package OOP.w_1;

public class Drink {
    public Drink(int price) {
        this.price = price;
    }

    private String name;
    private int volume; 
    private int price;

    public Drink(String name, int volume, int price) {
        this.name = name;
        this.volume = volume;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Drink [name=" + name + ", volume=" + volume + ", price=" + price + "]";
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public int getPrice() {
        return price;
    }

}
