import java.util.Scanner;

public class Runner {
    
    public static void main(String[] args) {
        
        NestedLoops drawer = new NestedLoops();
        Scanner sc = new Scanner(System.in);

        drawer.drawFilledBox();
        int width = getValidNonZeroInteger(sc, "Enter the width of your box: ");
        int height = getValidNonZeroInteger(sc, "Enter the height of your box: ");
        drawer.drawFilledBox(width, height);

        drawer.drawMultiChart();
        int rows = getValidNonZeroInteger(sc, "Enter the number of rows for your triangle: ");
        drawer.drawMultiChart(rows);


    }

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