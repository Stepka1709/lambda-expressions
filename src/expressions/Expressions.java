package expressions;

interface BinaryOperator<T extends Comparable> {
    T calculate(T... num);
}

interface Predicate<T extends Comparable> {
    boolean function(T... num);
}