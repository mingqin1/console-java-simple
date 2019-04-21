package chapter11;
import java.util.Optional;
import java.util.function.Function;

public class Sect7_Ex3
{
    public static void main(String[] args)
    {
        Optional.of(2)                                  // Optional(2)
                .map(new Function<Integer, Integer>() {
                    @Override
                    public Integer apply(Integer x) {
                        return ++x;
                    }
                })                      // Optional(3)
                .ifPresent(x -> System.out.println(x)); // Prints 3
    }
}


//new Function<Integer, Integer>() {
//   @Override
//   public Integer apply(Integer x) {
//        return ++x;
//        }