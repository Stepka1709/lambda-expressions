package expressions;


public class LambdaAppOne {

    public void start() {
        BinaryOperator<Integer> sum = (num) -> num[0] + num[1] + num[2];
        System.out.println("Numbers sum: " + sum.calculate(2, 2, 2));

        BinaryOperator<Integer> mul = (num) -> num[0] * num[2];
        System.out.println("Numbers multiplication: " + mul.calculate(2, 2, 2));

        BinaryOperator<Integer> fact = (num) -> {
            int result = 1;
            for (int i = 1; i <= num[0]; i++) {
                result = result * i;
            }
            return result;
        };
        System.out.println("Factorial: " + fact.calculate(4));

        Predicate<Integer> number = (num) -> {
            int temp;
            for (int i = 2; i <= num[0] / 2; i++) {
                temp = num[0] % i;
                if (temp == 0) {
                    return false;
                }
            }
            return true;
        };
        System.out.println("Prime number?: " + number.function(71));
    }
}
