package market;

import java.util.Arrays;
import java.util.List;

public class Market {
    Product prodA =  new Product("a", 1.25, 3, 3.0);
    Product prodB =  new Product("b", 4.25);
    Product prodC =  new Product("c", 1.00, 6, 5.0);
    Product prodD =  new Product("d", 0.75);

    private final List<Product> productList = Arrays.asList(prodA, prodB, prodC, prodD);

    public Market() {}

    public List<Product> getProductList() {
        return productList;
    }

    public Product getProduct(String name){
        return productList.stream().filter(product -> product.getName().equals(name)).findFirst().orElseThrow(() -> new IllegalArgumentException("There is no such product -> " + name));
    }

}
