package console;

public class LambdaAppFive {

    public void start() {
        Expression<Double> max = (a) -> {
            if (a.length > 3) return null;
            if (a.length == 3) {
                if (a[0] < a[1]) a[0] = a[1];
                if (a[0] < a[2]) a[0] = a[2];
                return a[0];
            }
            if (a.length == 2) {
                return a[0] > a[1] ? a[0] : a[1];
            }
            return a[0];
        };
        System.out.println("Test: " + max.function(4.11, 3.09, 4.12));
    }

    interface Expression<T extends Comparable> {
        T function(T ... z);
    }
}
