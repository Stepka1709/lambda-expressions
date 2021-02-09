package console;

public class LambdaAppTwo {

    public void start() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int a = 4;
        int b = 9;

        Expression sumEven = (num) -> num % 2 == 0;
        System.out.println("Sum of even: " + sum(numbers, sumEven));

        Expression sumOdd = (num) -> num % 2 == 1;
        System.out.println("Sum of odd: " + sum(numbers, sumOdd));

        Expression sumRange = (num) -> num >= a && num <= b;
        System.out.println("Range sum: " + sum(numbers, sumRange));

        Expression sumMul = (num) -> num % a == 0;
        System.out.println("Sum of multiples: " + sum(numbers, sumMul));
    }

    private int sum(int[] numbers, Expression sum) {
        int result = 0;
        for (int i : numbers) {
            if (sum.check(i)) {
                result += i;
            }
        }
        return result;
    }

    interface Expression {
        boolean check(int num);
    }
}
