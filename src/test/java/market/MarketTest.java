package market;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MarketTest {

    Market market = Market.getInstance();
    Product productA = new Product("a", 1.25, 3, 3.0);

    @Test
    void getTestNotNull() {
        assertNotNull(market.getProduct("a"));
    }

    @Test
    void getProductTestEquals() {
        assertEquals(productA, market.getProduct("a"));
    }

    @Test
    void getProductTestThrow() {
        assertThrows(IllegalArgumentException.class, () -> market.getProduct("s"));
    }

    @Test
    void getProductListTest() {
        assertEquals(4, market.getProductList().size());
    }

    @Test
    void getInstanceTest() {
        assertNotNull(Market.getInstance());
    }

}