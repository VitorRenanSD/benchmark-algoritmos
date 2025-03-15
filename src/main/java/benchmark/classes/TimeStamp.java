package benchmark.classes;

import benchmark.algorithms.*;

public class TimeStamp {
    public TimeStamp() {
    }

    public void benchBubbleSorting(int[] values) {
        BubbleSort bs = new BubbleSort();

        // Start measuring
        long startTime = System.nanoTime();

        bs.bubbleSort(values);

        // Stop measuring
        long endTime = System.nanoTime();

        // Calculate the execution time
        long executionTime = (endTime - startTime);

        System.out.println("Execution time for BubbleSort: " + executionTime + "ns. " + (executionTime / 1000000) + "ms.");
    }

    public void benchMergeSorting(int[] values) {

    }

    public void benchQuickSorting(int[] values) {

    }
}
