package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public static void printFactorialRow(int printToInclusive) {
        int i = 1;
        int j = 1;
        int result = 1;
        while(i<=printToInclusive){
            while(j<=i){
                result = result*j;
                j++;
            }
            i++;
            System.out.println(result);
        }
    }
}
