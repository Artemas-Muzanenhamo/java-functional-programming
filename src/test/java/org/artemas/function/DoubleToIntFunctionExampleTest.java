package org.artemas.function;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DoubleToIntFunctionExampleTest {
    private DoubleToIntFunctionExample doubleToIntFunctionExample;

    @BeforeEach
    void setup() {
        doubleToIntFunctionExample = new DoubleToIntFunctionExample();
    }

    @Test
    @DisplayName("Should return a primitive int given a primitive double as input")
    void returnsAPrimitiveDouble() {
        int result = doubleToIntFunctionExample.getIntValueBy(10.0);

        assertThat(result).isEqualTo(20);
    }
}
