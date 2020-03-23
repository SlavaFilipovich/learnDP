package by.project.java_fundamentals.main;

import java.util.ArrayList;
import java.util.List;

/**
 * This class performs following task:
 *  Enter the integer numbers as arguments of command line, calculate sum (multiplication)
 *  and display result in console.
 */
public class Task4 {
    private static final String PATTERN = "(-?)([0-9])+";
    private static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        int sum = 0;
        int multi = 1;
        if(args.length!=0) {
            checkArguments(args);
        }
        else System.out.println("No arguments");
        if(list.size()!=0){
            for (Integer integer : list) {
                sum +=integer;
                multi*=integer;
            }
            System.out.println("Sum of elements = "+sum);
            System.out.println("Multiplication of elements = "+multi);
        }
        else System.out.println("No integer elements among arguments");
    }

    /**
     * @param args arguments of command line to check as integer type.
     */
    private static void checkArguments(String[] args){
        for (String argument : args) {
            if(argument.matches(PATTERN)){
                list.add(Integer.parseInt(argument));
            }
        }
    }

}
