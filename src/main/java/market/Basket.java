package market;

public class Basket {
    Market market = Market.getInstance();

    public double calculateTotalCost(String basket) {
        double result = 0.0;
        char[] basketArray = basket.trim().toLowerCase().toCharArray();


        for (char c : basketArray) {
            market.getProduct(c + "").increaseAmount();
        }

        for (Product product : market.getProductList()) {
            result += product.getTotalPryce();
        }

        return result;
    }
}
