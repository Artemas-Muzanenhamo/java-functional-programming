package org.artemas.supplier;

import java.util.function.Supplier;

public class SupplierExample {
    public String getGreeting() {
        Supplier<String> supplier = () -> "Hello Artemas";
        return supplier.get();
    }
}
