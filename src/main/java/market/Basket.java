package market;

public class Basket {

    public double calculateTotalCost(String basket) {
        double result = 0.0;
        char[] basketArray = basket.trim().toLowerCase().toCharArray();
        Market market = new Market();

        for (char c : basketArray) {
            market.getProduct(c + "").increaseAmount();
        }

        for (Product product : market.getProductList()) {
            result += product.getTotalPryce();
        }

        System.out.println("Total price: " + result);
        return result;
    }

}
