package codingPractice;

import java.util.Arrays;
import java.util.List;

public class MultipleTest {

    public static void main(String[] args) {
        testMultipleOf5or7(Arrays.asList(5, 10, 7, 21, 35, 70, 100, 154));
    }

    public static void testMultipleOf5or7(List<Integer> integerList) {
        integerList.forEach(value -> {
            if (value % 5 == 0 && value % 7 == 0) {
                System.out.println(value + " : HelloWorld");
            } else if (value % 5 == 0) {
                System.out.println(value + " : Hello");
            } else if (value % 7 == 0) {
                System.out.println(value + " : World");
            }
        });
    }
}
