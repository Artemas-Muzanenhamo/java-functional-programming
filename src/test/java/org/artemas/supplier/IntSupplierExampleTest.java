package org.artemas.supplier;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class IntSupplierExampleTest {
    private IntSupplierExample intSupplierExample;

    @BeforeEach
    void setup() {
        intSupplierExample = new IntSupplierExample();
    }

    @Test
    @DisplayName("Should return a primitive int from the given supplier")
    void getAValueAsPrimitiveInt() {
        int number = intSupplierExample.getValue();

        assertThat(number).isEqualTo(10);
    }
}
