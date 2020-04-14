// Generate a Java OOM exception
public class GenerateOOM {

    public static void main(String[] args) throws Exception {
        GenerateOOM demo = new GenerateOOM();
        demo.generateOOM();
    }

    public void generateOOM() throws Exception {
        int iteratorValue = 20;
        System.out.println("\n=================> OOM test started..\n");
        for (int i = 1; i < 20; i++) {
            System.out.println("Iteration " + i + " Free Mem: " + Runtime.getRuntime().freeMemory());

            int loop1 = 2;
            int[] memoryFillIntVar = new int[iteratorValue];

            // Fill the memoryFillIntVar array in loop...
            do {
                memoryFillIntVar[loop1] = 0;
                loop1--;
            } while (loop1 > 0);

            iteratorValue = iteratorValue * 10;
            System.out.println("\nRequired Memory for next loop: " + iteratorValue);
            Thread.sleep(1000);
        }
    }
}
