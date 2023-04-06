package nextstep.optional;

import java.util.Arrays;
import java.util.Optional;

enum Expression {
    PLUS("+"), MINUS("-"), TIMES("*"), DIVIDE("/");

    private String expression;
    public static final String Illegal_Exception_Message = "%s는 사칙연산에 해당하지 않는 표현식입니다.";

    Expression(String expression) {
        this.expression = expression;
    }

    private static boolean matchExpression(Expression e, String expression) {
        return expression.equals(e.expression);
    }

    static Expression of(String expression) {
        return Arrays.stream(Expression.values())
                .filter(v -> matchExpression(v, expression))
                .findFirst()
                .orElseThrow(()->new IllegalArgumentException(String.format(Illegal_Exception_Message, expression)));
    }
}
