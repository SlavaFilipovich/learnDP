package by.project.java_fundamentals;

import java.util.Arrays;
import java.util.Scanner;


/**
 * This class performs following tasks:
 * 1. Enter "n" numbers to console.
 * 2. Find the shortest and the longest numbers. Output these numbers.
 * 3. Output the numbers in order from the shortest to the longest and output these in reverse order .
 * 4. Calculate average length of all numbers. Output numbers (and their length),
 * which has length less than average definition.
 * 5. Find numbers, which has minimum various types of digits.
 */
public class OptionalTask1 {
    private static final String PATTERN = "(-?)([0-9])+";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amountOfNumbers = sc.nextInt();
        String[] strings = new String[amountOfNumbers];

        for (int i = 0; i < amountOfNumbers; i++) {
            String tempInt = sc.next();
            if (tempInt.matches(PATTERN)) {
                strings[i] = tempInt;
            }
            else i--;
        }
        findShortAndLongNumbers(strings);
        System.out.println();

        sortLengthOfNumbers(strings);
        System.out.println();

        lessThanAverage(strings);
        System.out.println();

        minimumVariousDigits(strings);
    }

    /**
     * This method is looking for numbers, which have minimum various types of digits
     * @param strings input array of numbers as strings
     */
    private static void minimumVariousDigits(String[] strings) {
        int[] counts = new int[strings.length];
        for (int i = 0; i<strings.length;i++) {
            char[] chars = strings[i].toCharArray();
            for (int j = 0; j < chars.length; j++) {
                counts[i] = chars.length;
                if (counts[i] != 1) {
                    for (int k = j + 1; k < chars.length; k++) {
                        if (chars[j] == chars[k]) {
                            counts[i]--;
                        }
                    }
                }
            }
        }
        int min = Arrays.stream(counts).min().getAsInt();
        for (int i = 0; i < counts.length;i++) {
            if(counts[i] == min) {
                System.out.println(strings[i]);
                break;
            }
        }
    }

    /**
     * This method calculates average value from all the lengths of numbers. Then output numbers, which
     * length less than received value.
     * @param strings input array of numbers as strings
     */
    private static void lessThanAverage(String[] strings) {
        double sum = 0;
        double averageValue;
        for (String string : strings) {
            sum += string.length();
        }
        averageValue = sum/strings.length;
        for (String string : strings) {
            if(string.length()<averageValue)
                System.out.println("Number.length is less than Average:"+string+", length "+string.length());
        }
    }

    /**
     * This method sorts array in ascending order and prints him to console
     * @param strings input array of numbers as a strings
     */
    private static void sortLengthOfNumbers(String[] strings) {
        String[] stringsCopy = new String[strings.length];
        System.arraycopy(strings,0,stringsCopy,0,strings.length);
        String temp;
        for (int length = strings.length-1; length >= 0; length--) {
            for (int i = 0; i < length; i++) {
                if(stringsCopy[i].length()>stringsCopy[i+1].length()){
                    temp = stringsCopy[i];
                    stringsCopy[i] = stringsCopy[i+1];
                    stringsCopy[i+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(stringsCopy));
    }

    /**
     * This method is looking for shortest and longest values of lengths and prints them to console
     * @param list input collection of integer numbers
     */
    private static void findShortAndLongNumbers(String[] list){
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for (String s : list) {
            if (s.length() > max) {
                max = s.length();
            }
            if (s.length() < min) {
                min = s.length();
            }
        }
        System.out.print("\nFollowing Elements has MAX length: ");
        for (String s : list) {
            if(s.length() == max){
                System.out.print(s+" ");
            }
        }
        System.out.print("\nFollowing Elements has MIN length: ");
        for (String s : list) {
            if(s.length() == min){
                System.out.print(s+" ");
            }
        }

    }
}
