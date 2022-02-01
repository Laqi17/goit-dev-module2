package market;

import java.util.Objects;

public class Product {

    private String name;
    private double price;
    private int minAmount;
    private double discount;
    private int amount;

    public Product(String name, double price, int minAmount, double discount) {
        this.name = name;
        this.price = price;
        this.minAmount = minAmount;
        this.discount = discount;
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getMinAmount() {
        return minAmount;
    }

    public void setMinAmount(int minAmount) {
        this.minAmount = minAmount;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {this.amount = amount;}

    public void increaseAmount() {
        this.amount += 1;
    }

    public double getTotalPryce() {
        if (this.minAmount != 0) {
            return amount / minAmount * discount + amount % minAmount * price;
        }
        else return amount * price;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.price, price) == 0 && minAmount == product.minAmount && Double.compare(product.discount, discount) == 0 && amount == product.amount && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, minAmount, discount, amount);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                '}';
    }
}
