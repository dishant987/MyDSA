import java.util.HashSet;
import java.util.Set;
import java.util.function.Function;

class MainArray {
    public static void main(String[] args) {

        Function<String, String> f1 = x -> x.toUpperCase();
        Function<String, String> f2 = x -> x.substring(0, 3);
        Function<String, String> newF = f1.andThen(f2);

        Function<Integer, Integer> num = x -> x * 2;
        Function<Integer, Integer> num2 = x -> x * x * x;

        System.out.println(num.andThen(num2).apply(2));
        System.out.println(num2.andThen(num).apply(2));
        System.out.println("---------------------------");
        System.out.println(num.compose(num2).apply(2));
        System.out.println(num2.compose(num2).apply(2));
        System.out.println(num2.compose(num).apply(2));

    }
}