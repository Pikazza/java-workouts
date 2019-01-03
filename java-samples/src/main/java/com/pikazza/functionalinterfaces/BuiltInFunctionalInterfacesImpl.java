package com.pikazza.functionalinterfaces;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class BuiltInFunctionalInterfacesImpl {

  public static void main(String[] args) {
    checkingSuppliers();
    checkingPredicate();
    checkingConsumer();
    checkingFunction();
  }



  /**
   * This functional interface does the opposite of the Consumer, it takes no arguments but it
   * returns some value. It may return different values when it is being called more than once.
   * Since it's a functional interface, you can pass a lambda expression wherever a Supplier is
   * expected.
   */
  static void checkingSuppliers() {
    Supplier<String> stringSupplier = () -> "1. Suppliers part working";
    display(stringSupplier);
  }

  /**
   * A predicate is a statement that may be true or false depending on the values of its variables.
   * It can be thought of as a function that returns a value that is either true or false.
   * 
   * In Java 8, a Predicate is a functional interface that can be used anywhere you need to evaluate
   * a boolean condition. Since it's a functional interface, you can pass a lambda expression
   * wherever a Predicate is expected.
   */
  static void checkingPredicate() {
    Predicate<Integer> isGreterNumber = n -> n > 10;
    boolean status = isGreterNumber.test(22);
    display(() -> "2. Predicate part working with status:-" + status);
  }

  /**
   * This functional interface represents an operation that accepts a single input argument and
   * returns no result. The real outcome is the side-effects it produces. Since it's a functional
   * interface, you can pass a lambda expression wherever a Consumer is expected.
   */
  static void checkingConsumer() {
    Consumer<Product> updatePrice = p -> p.setPrice(1.99);
    Product product = new Product();
    updatePrice.accept(product);
    display(() -> "3. Consumer Part is working with price:- " + product.getPrice());
  }

  /**
   * This functional interface represents a function that accepts one argument and produces a
   * result. One use, for example, it's to convert or transform from one object to another. Since
   * it's a functional interface, you can pass a lambda expression wherever a Function is expected.
   */
  static void checkingFunction() {
    int n = 5;

    Function<Integer, Integer> function = val -> val + 10;
    display(() -> "4. Function part is ready with value:- " + function.apply(n));
    Function<Integer, Integer> function1 = val -> val * 100;
    display(() -> "4. Function part is ready with value:- " + function1.apply(n));

    // int m = modifyValue(n, val -> val + 10);
    // display(() -> "4. Function part is ready with value:- " + m);
    // int o = modifyValue(n, val -> val * 100);
    // display(() -> "4. Function part is ready with value:- " + o);

  }

  // static int modifyValue(int v, Function<Integer, Integer> function) {
  // int result = function.apply(v);
  // return result;
  // }

  static void display(Supplier<String> arg) {
    System.out.println(arg.get());
  }



}
