package OOP.w_1;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class AutomateSaleHot implements SaleAutomate {
    private List<HotDrink> hotDrinks = new LinkedList<>();
    HotDrink product;

    @Override
    public void addProduct(HotDrink drink) {
        this.hotDrinks.add((HotDrink) drink);

    }

    @Override
    public void getProduct() {
        System.out.print("Введите имя продукта из списка: Americano, Cappucino, Latte \n");
        Scanner enter3 = new Scanner(System.in);
        String newEnter = enter3.nextLine();
        System.out.print("Введите объем продукта из списка: 300, 200 \n");
        Scanner enter2 = new Scanner(System.in);
        int newEnter2 = enter2.nextInt();
        System.out.print("Введите температуру напитка: 70, 50 \n");
        Scanner enter1 = new Scanner(System.in);
        int newEnter1 = enter1.nextInt();

        for (HotDrink drink : hotDrinks) {
            if (newEnter.equals(drink.getName()) & newEnter2 == drink.getVolume()
                    & newEnter1 == drink.getTempurature()) {
                System.out.printf("Ваш напиток: %s его стоимость %d монет ", drink, drink.getPrice());
                product = drink;

            }
        }
        int cash = 0;
        System.out.print("Внесите купюру ");
        Scanner enter4 = new Scanner(System.in);
        Integer newEnte = enter4.nextInt();
        cash += newEnte;
        while (cash <= product.getPrice() || cash >= product.getPrice()) {
            if (cash < product.getPrice()) {
                System.out.printf("Стоимость напитка %d. Ваш баланс %d, внесите еще: ", product.getPrice(), cash);
                newEnte = enter4.nextInt();
                cash += newEnte;
            } else if (cash > product.getPrice()) {
                cash -= product.getPrice();
                System.out.printf("Ваш напиток %s. Ваша сдача %d ", product, cash);
                break;
            } else if (cash == product.getPrice()) {
                System.out.printf("Ваш напиток %s.", product);
                break;
            }

        }
        enter4.close();
        enter3.close();
        enter2.close();
        enter1.close();
    }

    @Override
    public void listDrink() {
        System.out.println(hotDrinks);
    }

}
