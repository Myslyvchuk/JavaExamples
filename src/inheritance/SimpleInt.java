package inheritance;

public class SimpleInt {

    public static void main(String[] args) {
        long counter = 0;
        long lineCounter = 0;
        long start = System.nanoTime();
        System.out.print("2 3 ");
        long i;
        for (i = 4; i < 1000000; i++) {
            for (long j = 2; j < i; j++) {
                if (i % j == 0) {
                    counter++;
                }
            }
            if (counter <= 0) {
                lineCounter++;
                if (lineCounter > 15){
                    System.out.println();
                    lineCounter = 0;
                }
                System.out.print(i + " ");
            }
            counter = 0;
        }

        System.out.println();
        System.out.println((System.nanoTime() - start) / 100000000 / 60);
    }
}
