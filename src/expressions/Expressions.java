package expressions;

interface BinaryOperator<T> {
    T calculate(T... num);
}

interface Predicate<T> {
    boolean function(T... num);
}