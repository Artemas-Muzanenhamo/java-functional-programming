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
    
```java
public interface Supplier<T> {
    T get();
}
```

* The above is a functional interface.
* The above can be written as follows:

```java
Supplier<String> supplier = () -> "Hello";
```