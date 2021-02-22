package expressions;

public class LambdaAppThree {

    public void start() {
        BinaryOperator<Double> max = (num) -> num[0] < num[1] ? num[0] : num[1];
        System.out.println("Max: " + max.calculate(1.1, 2.1));

        BinaryOperator<Integer> min = (num) -> num[0] < num[1] ? num[0] : num[1];
        System.out.println("Min: " + min.calculate(3, 9));
    }
}
