import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner userInput = new Scanner(System.in);
        Calculator calculator = new Calculator();
        int int1;
        int int2;

        System.out.println("Hello World!\n This is a Calculator.\n Please enter a command.\n");
        String command = userInput.next();
        while(!command.toLowerCase().equals("quit")) {
            if(command.toLowerCase().equals("add")) {
                int1 = userInput.nextInt();
                int2 = userInput.nextInt();
                System.out.println(" = " + calculator.add(int1, int2));
            }
            if(command.toLowerCase().equals("sub")) {
                int1 = userInput.nextInt();
                int2 = userInput.nextInt();
                System.out.println(" = " + calculator.add(int1, int2));
            }
            if(command.toLowerCase().equals("mult")) {
                int1 = userInput.nextInt();
                int2 = userInput.nextInt();
                System.out.println(" = " + calculator.add(int1, int2));
            }
            if(command.toLowerCase().equals("div")) {
                int1 = userInput.nextInt();
                int2 = userInput.nextInt();
                System.out.println(" = " + calculator.divide(int1, int2));
            }
            if(command.toLowerCase().equals("fib")) {
                int1 = userInput.nextInt();
                System.out.println(" = " + calculator.fibonacciNumberFinder(int1));
            }
            System.out.println("*****");
            command = userInput.next();
        }
    }
}
