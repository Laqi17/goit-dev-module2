package market;

import java.util.Arrays;
import java.util.List;

public class Market {
    private Product prodA =  new Product("a", 1.25, 3, 3.0);
    private Product prodB =  new Product("b", 4.25);
    private Product prodC =  new Product("c", 1.00, 6, 5.0);
    private Product prodD =  new Product("d", 0.75);
    private static Market market;

    public static Market getInstance(){
        if(market == null)  {
            return new Market();
        }
        else {
            return market;
        }
    }

    private Market() {}

    private final List<Product> productList = Arrays.asList(prodA, prodB, prodC, prodD);

    public List<Product> getProductList() {
        return productList;
    }

    public Product getProduct(String name){
        return productList.stream().filter(product -> product.getName().equals(name)).findFirst().orElseThrow(() -> new IllegalArgumentException("There is no such product -> " + name));
    }

}
