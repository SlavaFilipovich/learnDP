package by.project.java_fundamentals.main;

/**
 * This class performs following task:
 * Display in console arguments of command line in reverse order.
 */
public class Task2 {
    public static void main(String[] args) {
        if(args.length!=0) {
            reverseOrderOfArgs(args);
        }
        else System.out.println("No arguments");
    }

    /**
     * @param args - parameters of command line
     */
    private static void reverseOrderOfArgs(String[] args){
        for (int i = args.length-1; i >= 0; i--) {
            System.out.print(args[i]+" ");
        }
    }
}
