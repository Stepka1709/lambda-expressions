package expressions;

public class LambdaAppFive {

    public void start() {
        BinaryExpression<Double> max = (num) -> {
            if (num.length > 3) return null;
            if (num.length == 3) {
                if (num[0] < num[1]) num[0] = num[1];
                if (num[0] < num[2]) num[0] = num[2];
                return num[0];
            }
            if (num.length == 2) {
                return num[0] > num[1] ? num[0] : num[1];
            }
            return num[0];
        };
        System.out.println("Max: " + max.calculate(4.11, 3.09, 4.12));
    }
}
