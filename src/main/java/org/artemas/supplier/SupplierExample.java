package org.artemas.supplier;

import java.util.function.Supplier;


/*
@FunctionalInterface
public interface Supplier<T> {

    *//**
     * Gets a result.
     *
     * @return a result
     *//*
    T get();
}
*/
public class SupplierExample {
    public String getGreeting() {
        Supplier<String> supplier = () -> "Hello Artemas";
        return supplier.get();
    }
}
