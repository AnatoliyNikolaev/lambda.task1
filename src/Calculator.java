import java.util.function.*;

public class Calculator {
    static Supplier<Calculator> instance = Calculator::new;
    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply;
    BinaryOperator<Integer> devide = (x, y) -> y > 0 ? x / y : x * y;


    UnaryOperator<Integer> pow;
    UnaryOperator<Integer> abs;

    Predicate<Integer> isPositive;

    Consumer<Integer> println = System.out::println;

    public Calculator() {
        isPositive = x -> x > 0;
        abs = x -> x > 0 ? x : x * -1;
        pow = x -> x * x;
        multiply = (x, y) -> x * y;
    }
}
