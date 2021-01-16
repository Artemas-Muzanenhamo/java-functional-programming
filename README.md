# Java Functional Programming

## Foundation of the Java Stream API

![foundation-java-stream-api](https://user-images.githubusercontent.com/29547780/104248248-0e18cf80-5461-11eb-8cd1-0195f33b21d1.png)


## Functional Interfaces

* A Lambda Expression implements a `Functional Interface`.
* A Lambda Expression is not another way to write instances of anonymous classes.

### What is a Functional Interface?

* An interface.
* Has only one abstract method.
* Default and static methods do not count.
* Methods from Object Class do not count. I.e. `hashcode(), equals(), toString()`.
* May have one abstract methods.
* May have as many default methods
* May have as many static methods 
* May have methods from the Object Class.
* May be annotated with the `@FunctionalInterface` annotation.
    * This just tells the compiler to help me determine if the interface is a functional interface or not.
    * If not, it will throw a compiler error.
    
### Supplier Interface
```java
public interface Supplier<T> {
    T get();
}
```

* The above is a functional interface.
* A Supplier does not take any kind of object and produces any kind of object as long as it matches the `T` type you define when you define the supplier.
* The above can be written as follows:

```java
Supplier<String> supplier = () -> "Hello";
```


### Consumer Interface

```java
public interface Consumer<T> {
    void accept(T t);
}
```

* A consumer, consumes any kind of object which is defined on the parameter.
* Has a single method called `accept(T t)` that takes any kind of object and that does not produce or return anything.


### Predicate Interface

```java
public interface Predicate<T> {
    boolean test(T t);
}
```

* A Predicate will take some object `T` and perform a test with it to produce a boolean value `true` or `false`.
* Used in the filtering operations in the Stream API.

```java
public interface Function<T, R> {
    R apply(T t);
}
```

* Like the Predicate which returns a boolean value, a Function will take in any type of object and return another type of object.
* Used in the `map()` operation in the Stream API.