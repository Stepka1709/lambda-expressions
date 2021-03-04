package expressions;

import java.util.function.BinaryOperator;

public class LambdaAppFour {

    public void start() {
        BinaryExpression<Double> max = (num) -> {
            if (num[0] < num[1]) num[0] = num[1];
            if (num[0] < num[2]) num[0] = num[2];
            return num[0];
        };
        System.out.println("Max: " + max.calculate(1.04, 1.22, 1.13));

        BinaryExpression<Integer> min = (num) -> {
            if (num[0] > num[1]) num[0] = num[1];
            if (num[0] > num[2]) num[0] = num[2];
            return num[0];
        };
        System.out.println("Min: " + min.calculate(4, 5, 1));
    }
}