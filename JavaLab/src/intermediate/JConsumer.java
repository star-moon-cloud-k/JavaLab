package intermediate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

public class JConsumer {
    public static void consumerEx() {
        Consumer<String> consumer = s -> System.out.println(s.toUpperCase());

        consumer.accept("hello world " +
                "this is consumer accept example");
    }

    public static void consumerEx2() {
        IntConsumer consumer = n -> System.out.println(n + 100);

        consumer.accept(5);
        consumer.accept(10);
    }

    public static void consumerEx3() {
        Consumer<String> consumer = s -> System.out.println(s.toUpperCase());

        List<String> list = Arrays.asList("apple", "kiwi", "orange");
        list.forEach(consumer);
    }

    public static void consumerEx4() {
        List<String> fruits = Arrays.asList("apple", "kiwi", "orange");

        Consumer<List<String>> addNumber = list -> {
            for (int i = 0; i < list.size(); i++) {
                list.set(i, (i + 1) + ", " + list.get(i));
            }
        };
        Consumer<List<String>> printList = list -> {
            for (String fruit : list) {
                System.out.println(fruit);
            }
        };
        addNumber.andThen(printList).accept(fruits);
        //addNumber()가 수행된 이후에 printList()가 수행됩니다. 두개의 메소드로 전달되는 인자는 fruits 로, 동일한 객체가 전달됩니다.
    }

    public static void consumerEx5() {
        List<String> fruits = Arrays.asList("apple", "kiwi", "orange");

        Consumer<String> printfFruit = fruit -> System.out.println(" I like " + fruit);

        forEach(fruits, printfFruit);
    }

    static <T> void forEach(List<T> list, Consumer<T> consumer) {
        for (T t : list) {
            consumer.accept(t);
        }
    }

    public static void main(String[] args) {
        consumerEx();
        consumerEx2();
        consumerEx3();
        consumerEx4();
        consumerEx5();


    }
}
