package console;

public class LambdaAppFour {

    public void start() {
        Expression<Double> max = (a, b, c) -> {
            if (a < b) a = b;
            if (a < c) a = c;
            return a;
        };
        System.out.println("Max: " + max.function(1.04, 1.22, 1.13));

        Expression<Integer> min = (a, b, c) -> {
            if (a > b) a = b;
            if (a > c) a = c;
            return a;
        };
        System.out.println("Min: " + min.function(4, 5, 1));
    }

    interface Expression<T extends Comparable> {
        T function(T a, T b, T c);
    }
}
