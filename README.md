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
    
## Writing Suppliers, Consumers, Predicates and Functions

### Supplier Interface
```java
public interface Supplier<T> {
    T get();
}
```

* The above is a functional interface.
* A Supplier does not take any kind of object and produces any kind of object as long as it matches the `T` type you define when you define the supplier.
* The above can be implemented as follows:

```java
public class SupplierExample {
    public String getGreeting() {
        Supplier<String> supplier = () -> "Hello Artemas";
        return supplier.get();
    }
}
```

### Consumer Interface

```java
public interface Consumer<T> {
    void accept(T t);
}
```

* A consumer, consumes any kind of object which is defined on the parameter.
* Has a single method called `accept(T t)` that takes any kind of object and that does not produce or return anything.
* The above can be implemented as:

```java
public class ConsumerExample {
    public void printValue(String name) {
        Consumer<String> nameConsumer = System.out::println;
        nameConsumer.accept(name);
    }
}
```

### Predicate Interface

```java
public interface Predicate<T> {
    boolean test(T t);
}
```

* A Predicate will take some object `T` and perform a test with it to produce a boolean value `true` or `false`.
* Used in the filtering operations in the Stream API.
* The above can be implemented as the following lambda:

```java
public class PredicateExample {
    public List<String> stringNotStartingWithLetterT(List<String> strings) {
        Predicate<String> filter = (String someString) -> someString.startsWith("t");
        strings.removeIf(filter);

        return strings;
    }
}
```

### Function Interface
```java
public interface Function<T, R> {
    R apply(T t);
}
```

* Like the Predicate which returns a boolean value, a Function will take in any type of object and return another type of object.
* Used in the `map()` operation in the Stream API.
* The above can be implemented as: 

```java
public class FunctionExample {
    public List<String> getNames(List<User> users) {
        Function<User, String> userNames = User::getName;
        return users.stream()
                .map(userNames)
                .collect(toList());
    }
}
```

## Invoking a Lambda Expression on Objects and Primitive Types

### How fast Are Lambda Expressions?

* What you can put in a lambda, can be returned also in an instance of an anonymous class.
* Lambda expressions are compiled using specific byte code instructions called `invokedynamic` introduced in Java 7.
* Ta make lambdas even faster, you want to avoid autoboxing on lambdas (converting `int` to `INT` and auto-unboxing which is converting `INT` to `int`).

### Introducing the Specialized Interfaces

* The `java.util` package has interfaces that are tailored to with primitive types instead of wrapping types.
* E.g. you have the `IntPredicate` that takes an `int` and returns a `boolean`.

#### IntSupplier Interface
```java
@FunctionalInterface
public interface IntSupplier {
    int getAsInt();
}
```

* This can be implemented as follows: 

```java
public class IntSupplierExample {
    public int getValue() {
        IntSupplier supplier = () -> 10;
        return supplier.getAsInt();
    }
}
```

#### DoubleToIntFunction
```java
@FunctionalInterface
public interface DoubleToIntFunction {
    int applyAsInt(double value);
}
```

* This can be implemented as follow: 

```java
public class DoubleToIntFunctionExample {
    public int getIntValueBy(double input) {
        DoubleToIntFunction intFunction = value -> (int) value * 2;
        return intFunction.applyAsInt(input);
    }
}
```