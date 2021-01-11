package org.artemas.consumer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ConsumerExampleTest {

    private ConsumerExample consumerExample;

    @BeforeEach
    void setup() {
        consumerExample = new ConsumerExample();
    }

    @Test
    @DisplayName("Should print the String value passed in")
    void printStringValuePassed() {
        consumerExample.printValue("Artemas");
    }
}