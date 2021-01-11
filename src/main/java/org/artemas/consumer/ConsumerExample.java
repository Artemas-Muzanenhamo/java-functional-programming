package org.artemas.consumer;

import java.util.function.Consumer;

/*
@FunctionalInterface
public interface Consumer<T> {

    *//**
     * Performs this operation on the given argument.
     *
     * @param t the input argument
     *//*
    void accept(T t);
}
*/
public class ConsumerExample {

    public void printValue(String name) {
        Consumer<String> nameConsumer = System.out::println;
        nameConsumer.accept(name);
    }
}
