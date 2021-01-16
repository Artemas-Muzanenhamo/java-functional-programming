package org.artemas.supplier;

import java.util.function.IntSupplier;

public class IntSupplierExample {
    public int getValue() {
        IntSupplier supplier = () -> 10;
        return supplier.getAsInt();
    }
}
