package enter.J010;


import java.util.Objects;

public class JLambda2 {
    @FunctionalInterface
    public interface Supplier<T> {
        T get();
    }
    /*
    매개 변수 없이 반환값 만을 갖는 함수형 인터페이스
    Supplier는 T geT() 을 추산 메소드로 갖는다.
     */

    @FunctionalInterface
    public interface Consumer<T> {
        void accept(T t);

        default Consumer<T> andThen(Consumer<? super T> after) {
            Objects.requireNonNull(after);
            return (T t) -> {
                accept(t);
                after.accept(t);
            };
        }
    }
    /*
Consumer는 객체 T를 매개변수로 받아서 사용하며, 반환값은 없는 함수형 인터페이스이다.
Consumer는 void accept(T t)를 추상메소드로 갖는다.
또한 Consumer는 andThen이라는 함수를 제공하고 있는데, 이를 통해 하나의 함수가 끝난 후 다음 Consumer를 연쇄적으로 이용할 수 있다.
아래의 예제에서는 먼저 accept로 받아들인 Consumer를 먼저 처리하고, andThen으로 받은 두 번째 Consumer를 처리하고 있다.
함수형에서 함수는 값의 대입 또는 변경 등이 없기 때문에 첫 번째 Consumer가 split으로 데이터를 변경하였다 하더라도 원본의 데이터는 유지된다.

 */

    @FunctionalInterface
    public interface Function<T, R>{

        R apply(T t);

        default <V> Function<V, R> compose(Function <? super V , ? extends T> before){
            Objects.requireNonNull(before);
            return (V v) -> apply(before.apply(v));
        }

        default <V> Function<T , V> andThen(Function<? super R, ? extends V> after){
            Objects.requireNonNull(after);
            return (T t) -> after.apply(apply(t));
        }

        static <T> Function<T , T> identity(){
            return t -> t;
        }

    }
/*
Function은 객체 T를 매개변수로 받아서 처리한 후 R로 반환하는 함수형 인터페이스다.
Function은 R apply(T t)를 추상메소드로 갖는다.
또한 Function은 Consumer와 마찬가지로 andThen을 제공하고 있으며, 추가적으로 compose를 제공하고 있다. 앞에서 andThen은 첫 번째 함수가 실행된 이후에 다음 함수를 연쇄적으로 실행하도록 연결해준다고 하였다. 하지만 compose는 첫 번째 함수 실행 이전에 먼저 함수를 실행하여 연쇄적으로 연결해준다는 점에서 차이가 있다.
또한 identity 함수가 존재하는데, 이는 자기 자신을 반환하는 static 함수이다.
출처: https://mangkyu.tistory.com/113 [MangKyu's Diary:티스토리]
 */

    @FunctionalInterface
    public interface Predicate<T> {
        boolean test(T t);

        default Predicate<T> and(Predicate<? super T> other){
            Objects.requireNonNull(other);
            return (t) -> test(t) && other.test(t);
        }

        default Predicate<T> negate(){
            return (t) -> !test(t);
        }

        default Predicate<T> or(Predicate<? super T> other){
            Objects.requireNonNull(other);
            return (t) -> test(t) || other.test(t);
        }

        static <T> Predicate<T> isEqaul(Object targetRef){
            return (null == targetRef)
                    ? Objects::isNull
                    : object -> targetRef.equals(object);
        }
    }




    public static void main(String[] args) {
//        Supplier<T>
        Supplier<String> supplier = () -> "Hello World";
        System.out.println(supplier.get());


        //consumer<t>
        Consumer<String> consumer = (str) -> System.out.println(str.split(" ")[0]);
        consumer.andThen(System.out::println).accept("Hello World");

        //Function<T , R>
        Function<String , Integer> function = str -> str.length();
        function.apply("Hello World");

        //Predicate<T>
        Predicate<String> predicate = (str) -> str.equals("Hello World");
        predicate.test("Hello World");
    }
}
