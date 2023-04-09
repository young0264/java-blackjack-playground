package nextstep.fp;

import java.util.List;

public class Lambda {

    public static final int ZERO = 0;
    public static final int TWO = 2;
    public static final int THREE = 3;
    public static void printAllOld(List<Integer> numbers) {
        System.out.println("printAllOld");
        numbers.forEach(System.out::println);
    }

    public static void printAllLambda(List<Integer> numbers) {
        System.out.println("printAllLambda");
        numbers.forEach(System.out::println);
    }

    public static void runThread() {
        new Thread(()-> System.out.println("Hello from thread"))
                .start();
    }


    private static int sumAllByCondition(List<Integer> numbers, Conditional conditional) {
        return numbers.stream()
                .filter(conditional::test)
                .mapToInt(Integer::intValue) //Stream<Integer>를 IntStream으로 변경한다.
                .sum();
    }


    public static int sumAll(List<Integer> numbers) {
        return sumAllByCondition(numbers, number -> true);
    }
        public static int sumAllEven(List<Integer> numbers) {
        return sumAllByCondition(numbers, number -> number % TWO == ZERO);
    }
    public static int sumAllOverThree(List<Integer> numbers) {
        return sumAllByCondition(numbers, number -> number > THREE);
    }


}
