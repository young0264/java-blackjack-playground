package nextstep.fp;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Lambda {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
//        numbers.forEach(x -> System.out.println(x));
        numbers.forEach(System.out::println);
    }

    public static void printAllOld(List<Integer> numbers) {
        System.out.println("printAllOld");

        for (int number : numbers) {
            System.out.println(number);
        }
    }

    public static void printAllLambda(List<Integer> numbers) {
        System.out.println("printAllLambda");
        numbers.forEach(System.out::println);
    }

    public static void runThread() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from thread");
            }
        }).start();
    }
    public static int sumAllByCondition(List<Integer> numbers, Conditional c) {
        int total = 0;
        return numbers.stream()
                .filter(num -> c.test(num))
                .reduce(0, (x, y) -> x + y);

    }
    public static int sumAll(List<Integer> numbers) {
        return sumAllByCondition(numbers, number -> true);
    }

    public static int sumAllEven(List<Integer> numbers) {
        return sumAllByCondition(numbers, number -> number % 2 == 0);
    }

    public static int sumAllOverThree(List<Integer> numbers) {
        return sumAllByCondition(numbers, number -> number > 3);
    }



/**
 *
 */
//    public static int sumAll(List<Integer> numbers) {
//        return numbers.stream()
//                .mapToInt(Integer::intValue)
//                .sum();
//    }
//
//    public static int sumAllEven(List<Integer> numbers) {
//        return numbers.stream()
//                .filter(x -> x % 2 == 0)
//                .mapToInt(Integer::intValue)
//                .sum();
//    }
//
//    public static int sumAllOverThree(List<Integer> numbers) {
//        return numbers.stream()
//                .filter(x -> x > 3)
//                .mapToInt(Integer::intValue)
//                .sum();
//    }

}
