public class NestedLoops {
    public void drawFilledBox() {

        for (int outer = 1; outer <= 10; outer++) {

            for(int inner = 1; inner <= 10; inner++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public void drawFilledBox(int width, int height) {

        int row = 0;
        while (row <= height) {
            int col = 0;
            while(col <= width) {
                System.out.println("*");
                col++;
            }

            System.out.println();
            row++;
        }
        
    }
    
    public void drawMultiChart() {
        for (int outer = 1; outer <= 3; outer++) {

            for (int inner = 1; inner <= 4; inner++) {
                System.out.print((inner*outer) + " ");
            }

            System.out.println();
        }
    }

    public void drawTriangle(int numRows) {
        for (int outer = 1; outer <= numRows; outer++) {
            for (int inner = 1; inner <= outer; inner++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}