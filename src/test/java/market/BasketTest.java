package market;

import org.junit.jupiter.api.Test;

//please delete unused imports
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class BasketTest {

    Basket basket = new Basket();

    @Test
    void calculateTotalCost() {
        assertEquals(3.0, basket.calculateTotalCost(" Aaa"));
    }
}