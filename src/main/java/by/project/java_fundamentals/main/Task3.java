package by.project.java_fundamentals.main;

import java.util.ArrayList;
import java.util.List;

/**
 * This class performs following task:
 *  Output given amount of random numbers with and without newline.
 */

public class Task3 {

    public static void main(String[] args) {
        int amountOfNumb = 5;
        randomNumbers(amountOfNumb);
    }

    /**
     * @param number - amount of numbers, declared in the class, for output.
     */
    private static void randomNumbers(int number){
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            int num = (int) (Math.random()*100);
            list.add(num);
        }for (Integer integer : list) {
            System.out.print(integer+" ");
        }
        System.out.println();
        for (Integer integer : list) {
            System.out.print("\n"+integer);
        }
    }
}
