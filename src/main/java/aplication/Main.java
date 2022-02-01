package aplication;

import market.Basket;

public class Main {

    public static void main(String[] args) {
        Basket basket = new Basket();
        System.out.println(basket.calculateTotalCost(" ABCDABA"));

    }
}
