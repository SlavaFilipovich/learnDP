package by.project.java_fundamentals.main;


/**
 * This class performs following task:
 * Welcome for any user, which name is entered through the command line.
 */
public class Task1 {
    public static void main(String[] args) {
        if(args.length!=0) {
            System.out.println("Hello, "+args[0]+"! Glad to see you!");
        }
        else System.out.println("No arguments");
    }
}
