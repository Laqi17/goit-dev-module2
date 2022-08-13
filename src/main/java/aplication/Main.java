package aplication;

import market.Basket;
import market.Market;
import market.Product;

public class Main {

    public static void main(String[] args) {
        Market market = new Market();
        Basket basket = new Basket(market);

        Product prodA =  new Product("a", 1.25, 3, 3.0);
        Product prodB =  new Product("b", 4.25);
        Product prodC =  new Product("c", 1.00, 6, 5.0);
        Product prodD =  new Product("d", 0.75);

        market.addProductToMarket(prodA);
        market.addProductToMarket(prodB);
        market.addProductToMarket(prodC);
        market.addProductToMarket(prodD);

        System.out.println(basket.calculateTotalCost(" ABCDABA"));

    }
}
