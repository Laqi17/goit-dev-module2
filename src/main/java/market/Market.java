package market;

import java.util.ArrayList;
import java.util.List;

public class Market {
    private final List<Product> productList = new ArrayList<>();

    public void addProductToMarket(Product product){
        productList.add(product);
    }

    public List<Product> getProductList() {
        return productList;
    }

    public Product getProduct(String name){
        return productList.stream().filter(product -> product.getName().equals(name)).findFirst().orElseThrow(() -> new IllegalArgumentException("There is no such product -> " + name));
    }

}
