package market;

public class Basket {

    public double calculateTotalCost(String basket) {
        double result = 0.0;
        char[] basketArray = basket.trim().toLowerCase().toCharArray();
        // for each calculation we are creating new products, is it right?
        // On my opinion the discount product amount should be one for all users
        // anyway it will take a lot of memory, could we avoid it?
        Market market = new Market();

        for (char c : basketArray) {
            market.getProduct(c + "").increaseAmount();
        }

        for (Product product : market.getProductList()) {
            result += product.getTotalPryce();
        }

        //actually if method should calculate something it shouldn't print anything
        // for printing we can have another method. It's Single responsibility principal
        System.out.println("Total price: " + result);
        return result;
    }

}
