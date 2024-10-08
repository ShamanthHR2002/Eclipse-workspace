package com.xworkz.functioninterface;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.DoublePredicate;
import java.util.function.DoubleSupplier;
import java.util.function.DoubleToIntFunction;
import java.util.function.DoubleToLongFunction;
import java.util.function.DoubleUnaryOperator;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntSupplier;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntToLongFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.LongPredicate;
import java.util.function.LongSupplier;
import java.util.function.LongToDoubleFunction;
import java.util.function.LongToIntFunction;
import java.util.function.LongUnaryOperator;
import java.util.function.ObjDoubleConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.ObjLongConsumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToDoubleBiFunction;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntBiFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongBiFunction;
import java.util.function.ToLongFunction;
import java.util.function.UnaryOperator;

public class Functioninterface { 
    public static void main(String[] args) {
        BiConsumer<Integer, Integer> biConsumer = (a, b) -> {
            System.out.println("The value is: " + (a + b));
        };
        biConsumer.accept(82, 20);

        BiFunction<Integer, Integer, Integer> multiply = (a, b) -> {
            System.out.println("Multiplication " + (a * b));
            return a * b;
        };
        multiply.apply(3, 2);
        System.out.println("---------------------------------------------------");

        BiPredicate<String, Integer> biPredicate = (s, n) -> s.length() > n;
        biPredicate.test("Fortune", 5);

        System.out.println("---------------------------------------------------");

        BooleanSupplier booleanSupplier = () -> true;
        System.out.println(booleanSupplier.getAsBoolean());

        Consumer<Integer> consumer = (a) -> {
            for (int i = 0; i <= 10; i++) {
                System.out.println(i);
            }
        };
        consumer.accept(5);

        System.out.println("---------------------------------------------------");

        DoubleBinaryOperator doubleBinaryOperator = (a, b) -> {
            System.out.println(a * b);
            return a * b;
        };
        doubleBinaryOperator.applyAsDouble(10, 20);

        System.out.println("---------------------------------------------------");

        DoubleConsumer doubleConsumer = (value) -> {
            System.out.println("The value is: " + value);
        };
        doubleConsumer.accept(10);

        System.out.println("---------------------------------------------------");

        DoubleFunction<String> doubleFunction = (value) -> {
            System.out.println("The value is: " + value);
            return "Value";
        };
        doubleFunction.apply(99.3);

        System.out.println("---------------------------------------------------");

        DoublePredicate doublePredicate = (value) -> {
            if (value > 0) {
                System.out.println("The value is positive");
                return true;
            } else {
                System.out.println("The value is negative");
                return false;
            }
        };
        doublePredicate.test(2);

        System.out.println("---------------------------------------------------");

        DoubleToIntFunction doubleToIntFunction = (value) -> {
            return (int) Math.round(value);
        };
        doubleToIntFunction.applyAsInt(9.6);

        System.out.println("---------------------------------------------------");

        DoubleToLongFunction doubleToLongFunction = (value) -> {
            return (long) value;
        };
        doubleToLongFunction.applyAsLong(9.635);

        System.out.println("---------------------------------------------------");

        DoubleUnaryOperator doubleUnaryOperator = (value) -> {
            System.out.println("The square is: " + value * value);
            return value * value;
        };
        doubleUnaryOperator.applyAsDouble(2.5);

        System.out.println("---------------------------------------------------");

        Function<String, Integer> function = (str) -> Integer.parseInt(str);
        System.out.println(function.apply("123"));

        System.out.println("---------------------------------------------------");

        IntBinaryOperator intBinaryOperator = (value1, value2) -> {
            return Math.max(value1, value2);
        };
        intBinaryOperator.applyAsInt(20, 10);

        System.out.println("---------------------------------------------------");

        IntConsumer intConsumer = (value) -> {
            System.out.println("Value is: " + value);
        };
        intConsumer.accept(100);

        System.out.println("---------------------------------------------------");

        IntPredicate intPredicate = (value) -> value % 2 == 0;
        intPredicate.test(4);

        System.out.println("---------------------------------------------------");

        IntSupplier intSupplier = () -> 5; // providing a default value
        intSupplier.getAsInt();

        System.out.println("---------------------------------------------------");

        IntToDoubleFunction intToDoubleFunction = (value) -> (double) value;
        intToDoubleFunction.applyAsDouble(50);

        System.out.println("---------------------------------------------------");

        IntToLongFunction intToLongFunction = (value) -> (long) value;
        intToLongFunction.applyAsLong(25);

        System.out.println("---------------------------------------------------");

        IntUnaryOperator intUnaryOperator = (value) -> value + 10;
        intUnaryOperator.applyAsInt(20);

        System.out.println("---------------------------------------------------");

        LongBinaryOperator longBinaryOperator = (a, b) -> a * b;
        longBinaryOperator.applyAsLong(12345L, 21034L);

        System.out.println("---------------------------------------------------");

        LongConsumer longConsumer = (value) -> {
            System.out.println("Long value: " + value);
        };
        longConsumer.accept(12345678L);

        System.out.println("---------------------------------------------------");

        LongFunction<String> longFunction = (value) -> Long.toString(value); // converting long to string
        longFunction.apply(1234567L);

        System.out.println("---------------------------------------------------");

        LongPredicate longPredicate = (value) -> value % 2 == 0;
        longPredicate.test(1234567L);

        System.out.println("---------------------------------------------------");

        LongToDoubleFunction longToDoubleFunction = (value) -> (double) value;
        longToDoubleFunction.applyAsDouble(1234567L);

        System.out.println("---------------------------------------------------");

        LongToIntFunction longToIntFunction = (value) -> (int) value;
        longToIntFunction.applyAsInt(1234567L);

        System.out.println("---------------------------------------------------");

        LongUnaryOperator longUnaryOperator = (value) -> value + 1;
        longUnaryOperator.applyAsLong(1234567L);

        System.out.println("---------------------------------------------------");

        ObjDoubleConsumer<String> objDoubleConsumer = (str, value) -> {
            System.out.println("The string is: " + str + " and value is: " + value);
        };
        objDoubleConsumer.accept("Karnataka", 124.254);

        System.out.println("---------------------------------------------------");

        ObjIntConsumer<String> objIntConsumer = (str, value) -> {
            System.out.println("The string is: " + str + " and value: " + value);
        };
        objIntConsumer.accept("Nada Habba", 123);

        System.out.println("---------------------------------------------------");

        ObjLongConsumer<String> objLongConsumer = (str, value) -> {
            System.out.println("The string is: " + str + " and value: " + value);
        };
        objLongConsumer.accept("Mysore", 123456L);

        System.out.println("---------------------------------------------------");

        Predicate<Integer> predicate = (value) -> value % 2 == 0;
        predicate.test(5);

        System.out.println("---------------------------------------------------");

        Supplier<String> supplier = () -> "Default value";
        supplier.get();

        System.out.println("---------------------------------------------------");

        ToDoubleBiFunction<Double, Double> toDoubleBiFunction = (num1, num2) -> (num1 + num2) / 2.0;
        toDoubleBiFunction.applyAsDouble(20.36, 25.46);

        System.out.println("---------------------------------------------------");

        ToDoubleFunction<Double> toDoubleFunction = (radius) -> radius * radius;
        toDoubleFunction.applyAsDouble(2.3);

        System.out.println("---------------------------------------------------");

        ToIntBiFunction<Integer, Integer> toIntBiFunction = (a, b) -> a + b;
        toIntBiFunction.applyAsInt(10000000, 100);

        System.out.println("---------------------------------------------------");

        ToIntFunction<String> toIntFunction = (value) -> Integer.parseInt(value);
        toIntFunction.applyAsInt("123456");

        System.out.println("---------------------------------------------------");

        ToLongBiFunction<Integer, Integer> toLongBiFunction = (num1, num2) -> (long) num1 * num2;
        toLongBiFunction.applyAsLong(23, 32);

        System.out.println("---------------------------------------------------");

        ToLongFunction<String> toLongFunction = (value) -> Long.parseLong(value);
        toLongFunction.applyAsLong("123456789");

        System.out.println("---------------------------------------------------");

        UnaryOperator<String> unaryOperator = (value) -> value.toUpperCase();
        unaryOperator.apply("formula 1");
    }
}
