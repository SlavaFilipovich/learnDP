package by.project.java_fundamentals.main;


/**
 * This class performs following task:
 *  Enter the number between 1 and 12 inclusively. Display in console name of month according to entered number.
 *  Check all the numbers to correct.
 */
public class Task5 {
    private static String[] LIST_OF_MONTH = {"January", "February","March", "April", "May","June", "July","August",
            "September","October", "November", "December"};

    public static void main(String[] args) {
        int number = enterNumberAndCheck(args);
        try {
            System.out.println(LIST_OF_MONTH[number - 1]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("There is not such number of month. Try again!");
        }
    }

    /**
     * @param args arguments of command line to check for correspondence given range
     * @return number of month
     */
    private static int enterNumberAndCheck(String[] args) throws NumberFormatException {
        try {
            if(args.length == 1) {
                return Integer.parseInt(args[0]);
            }
        }catch (NumberFormatException e) {
            throw new NumberFormatException("Not suitable format of numbers or amount. Try again");
        }
        return 0;
    }
}


