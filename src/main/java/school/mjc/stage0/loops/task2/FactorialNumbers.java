package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int i = 1;
        int j = 1;
        int k = 1;
        int result = 1;
        System.out.println(k);
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
