package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public static void printPower(int power) {
        int i = 0;
        while(i<=power){
            System.out.println((int)Math.pow(2.0, (double) i));
            i++;
        }
    }
}
