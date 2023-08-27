package codingPractice;

import java.util.Arrays;
import java.util.List;

public class SecondLargest {

    public static void main(String[] args) {
        findSecondBiggest(Arrays.asList(1, 2, 3, 4, 5));
        findSecondBiggest(Arrays.asList(19, 9, 11, 0, 12));
    }

    public static void findSecondBiggest(List<Integer> integerList) {

        int largestNumber = Integer.MIN_VALUE;
        int secondLargestNumber = Integer.MIN_VALUE;

        for (int value : integerList) {
            if (value > largestNumber) {
                secondLargestNumber = largestNumber;
                largestNumber = value;
            } else if (value > secondLargestNumber && value < largestNumber) {
                secondLargestNumber = value;
            }
        }
        System.out.println("Second largest in given List " + integerList + " is " + secondLargestNumber);
    }
}
