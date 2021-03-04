package expressions;

interface BinaryExpression<T> {
    T calculate(T... num);
}