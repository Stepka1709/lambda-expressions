package console;

public class LambdaAppOne {

    public void start() {
        ExpressionOne sum = (x, y, z) -> x + y + z;
        System.out.println("Numbers sum: " + sum.calculate(2, 2, 2));

        ExpressionOne mul = (x, y, z) -> x * y * z;
        System.out.println("Numbers multiplication: " + mul.calculate(2, 2, 2));

        ExpressionTwo fact = (number) -> {
            int result = 1;
            for (int i = 1; i <= number; i++) {
                result = result * i;
            }
            return result;
        };
        System.out.println("Factorial: " + fact.factorial(4));

        ExpressionThree num = (number) -> {
            int temp;
            for (int i = 2; i <= number / 2; i++) {
                temp = number % i;
                if (temp == 0) {
                    return false;
                }
            }
            return true;
        };
        System.out.println("Prime number?: " + num.check(71));
    }

    interface ExpressionOne {
        int calculate(int x, int y, int z);
    }

    interface ExpressionTwo {
        int factorial(int number);
    }

    interface ExpressionThree {
        boolean check(int number);
    }
}
