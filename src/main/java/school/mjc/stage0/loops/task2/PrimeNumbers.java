package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int i = 1;
        boolean b = true;
        while (i <= printToInclusive) {
            if (b && i != 1 && i != 0) {
                System.out.println(i);
            }
            int j = 2;
            i++;
            while (j < i) {
                if (i % j == 0) {
                    b = false;
                    break;
                }
                b = true;
                j++;
            }
        }
    }
}