package OOP.w_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        AutomateSaleHot machine = new AutomateSaleHot();
        machine.addProduct(new HotDrink("Americano ", 200, 50, 70));
        machine.addProduct(new HotDrink("Americano ", 200, 50, 50));
        machine.addProduct(new HotDrink("Americano ", 300, 70, 70));
        machine.addProduct(new HotDrink("Americano ", 300, 70, 50));
        machine.addProduct(new HotDrink("Cappucino ", 300, 100, 50));
        machine.addProduct(new HotDrink("Cappucino ", 300, 100, 70));
        machine.addProduct(new HotDrink("Cappucino ", 200, 80, 50));
        machine.addProduct(new HotDrink("Cappucino ", 200, 80, 70));
        machine.addProduct(new HotDrink("Latte", 300, 100, 50));
        machine.addProduct(new HotDrink("Latte", 300, 100, 70));
        machine.addProduct(new HotDrink("Latte", 200, 80, 50));
        machine.addProduct(new HotDrink("Latte", 200, 80, 70));
        List<AutomateSaleHot> addAutomate = new ArrayList<>();
        addAutomate.add(machine);
        machine.listDrink();

        getProduct();

    }
}