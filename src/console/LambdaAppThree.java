package console;

public class LambdaAppThree {

    public void start() {
        Expression<Double> max = (a, b) -> a > b ? a : b;
        System.out.println("Max: " + max.function(1.1, 2.1));

        Expression<Integer> min = (a, b) -> a < b ? a : b;
        System.out.println("Min: " + min.function(3, 9));
    }

    interface Expression<T extends Comparable> {
        T function(T a, T b);
    }
}
