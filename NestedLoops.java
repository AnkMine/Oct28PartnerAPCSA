public class NestedLoops {
    public void drawMultiChart() {
        for (int outer = 1; outer <= 3; outer++) {

            for (int inner = 1; inner <= 4; inner++) {
                System.out.print((inner*outer) + " ");
            }
            System.out.println();
        }
    }
}