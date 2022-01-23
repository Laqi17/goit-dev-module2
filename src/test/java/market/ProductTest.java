package market;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;


class ProductTest {

    Product productA = new Product("a", 10, 6, 0.5);
    Product productB = new Product("a", 10);

    @Test
    void getTotalPriceTestShouldReturn40_5() {
        int amount = 10 ;
        double expected = 40.5;

        productA.setAmount(amount);
        assertEquals(expected, productA.getTotalPryce());
    }

    @Test
    void getTotalPriceTestShouldReturn40() {
        int amount = 10 ;
        double expected = 100;

        productB.setAmount(amount);
        assertEquals(expected, productB.getTotalPryce());
    }
}