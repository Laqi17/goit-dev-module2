package market;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class MarketTest {

    List<Product> mockList = Arrays.asList(
            new Product("a", 1.25, 3, 3.0),
            new Product("b", 4.25),
            new Product("c", 1.00, 6, 5.0),
            new Product("d", 0.75)
    );

    Market market = new Market();
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

}