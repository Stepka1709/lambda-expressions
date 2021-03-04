package expressions;

import java.util.function.Predicate;

public class LambdaAppOne {

    public void start() {
        BinaryExpression<Integer> sum = (num) -> num[0] + num[1] + num[2];
        System.out.println("Numbers sum: " + sum.calculate(2, 2, 2));

        BinaryExpression<Integer> mul = (num) -> num[0] * num[1] * num[2];
        System.out.println("Numbers multiplication: " + mul.calculate(2, 2, 2));

        BinaryExpression<Integer> fact = (num) -> {
            int result = 1;
            for (int i = 1; i <= num[0]; i++) {
                result = result * i;
            }
            return result;
        };
        System.out.println("Factorial: " + fact.calculate(4));

        Predicate<Integer> number = (num) -> {
            int temp;
            for (int i = 2; i <= num / 2; i++) {
                temp = num % i;
                if (temp == 0) {
                    return false;
                }
            }
            return true;
        };
        System.out.println("Prime number?: " + number.test(71));
    }
}
