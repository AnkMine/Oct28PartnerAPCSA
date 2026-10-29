public class NestedLoops {

    // method that draws a 10x10 filled box of stars
    public void drawFilledBox() {

        // outer loop prints each row
        for (int outer = 1; outer <= 10; outer++) {

            // inner loop prints 10 stars across
            for(int inner = 1; inner <= 10; inner++) {
                System.out.print("*");
            }

            // moves to next line after the row is complete
            System.out.println();
        }
    }

    // method that draws a filled box of stars given width and height
    public void drawFilledBox(int width, int height) {

        // counters start at 1 so <= height and <= width give exactly the right # of rows and cols
        int row = 1;
        // while loop to print each row of the box
        while (row <= height) {
            int col = 1;
            // while loop to print width stars across the row
            while(col <= width) {
                // print keeps stars on same line, println would break the row up
                System.out.print("*");
                col++;
            }

            System.out.println();
            row++;
        }

    }

    // method that prints a chart of products, 3 rows by 4 columns
    public void drawMultiChart() {
        // outer loop for rows, inner loop multiplies row x column
        for (int outer = 1; outer <= 3; outer++) {

            for (int inner = 1; inner <= 4; inner++) {
                System.out.print((inner*outer) + " ");
            }

            System.out.println();
        }
    }

    // method that draws a right triangle of stars given number of rows
    public void drawTriangle(int numRows) {
        // outer loop for rows, inner loop prints as many stars as the row number
        for (int outer = 1; outer <= numRows; outer++) {
            for (int inner = 1; inner <= outer; inner++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}