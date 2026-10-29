// import scanner class
import java.util.Scanner;

// main class
public class Runner {
    
    // main method
    public static void main(String[] args) {
        
        // create new instance of NestedLoops class and scanner class
        NestedLoops drawer = new NestedLoops();
        Scanner sc = new Scanner(System.in);

        // calls drawFilledBox(); methods, default 10x10 then one with user's width and height
        drawer.drawFilledBox();
        int width = getValidNonZeroInteger(sc, "Enter the width of your box: ");
        int height = getValidNonZeroInteger(sc, "Enter the height of your box: ");
        drawer.drawFilledBox(width, height);

        // calls drawMultiChart(); then gets rows from user and calls drawTriangle();
        drawer.drawMultiChart();
        int rows = getValidNonZeroInteger(sc, "Enter the number of rows for your triangle: ");
        drawer.drawTriangle(rows);


    }

    // this method takes in a Scanner and a prompt and ensures the user enters a valid non-zero integer
    private static int getValidNonZeroInteger(Scanner sc, String prompt) {
        // stores user input and validity flag
        int userInput = 0;
        boolean isValid = false;
        // loops until a valid non-zero integer is entered
        while(!isValid) {

            // prints the prompt
            System.out.println(prompt);

            // checks if input is an int, then makes sure it is not 0 before marking valid
            if (sc.hasNextInt()) {
                userInput = sc.nextInt();
                sc.nextLine();
                
                if (userInput != 0) {
                    isValid = true; // exits loop on next check
                }
            } else {
                sc.nextLine();
            }

            // prints error if input was not a valid non-zero integer
            if (!isValid) {
                System.out.println("Error. Please enter a non-zero integer");
            }
        }

        return userInput;

    }

}