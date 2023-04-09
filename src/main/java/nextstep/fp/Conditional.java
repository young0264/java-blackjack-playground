package nextstep.fp;
//    number를 받아서 boolean을 리턴한다
//    number -> boolean 로 표현
@FunctionalInterface
public interface Conditional {
    boolean test(Integer number);
}
