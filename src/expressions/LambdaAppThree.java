package expressions;

import java.util.function.BinaryOperator;

public class LambdaAppThree {

    public void start() {
        BinaryExpression<String> max = (w) -> w[0].compareTo(w[1]) > 0 ? w[0] : w[1];
        System.out.println("String max: " + max.calculate("qwert", "qwerty"));

        BinaryOperator<Integer> min = (a, b) -> a < b ? a : b;
        System.out.println("String min: " + min.apply(11, 22));
    }
}
