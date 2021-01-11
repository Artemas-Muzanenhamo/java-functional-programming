package org.artemas.supplier;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SupplierExampleTest {

    private SupplierExample supplierExample;

    @BeforeEach
    void setUp() {
        supplierExample = new SupplierExample();
    }

    @Test
    @DisplayName("Should return the supplier with value 'Hello' ")
    void returnSupplierValue() {
        String value = supplierExample.getGreeting();

        assertThat(value).isEqualTo("Hello Artemas");
    }
}
