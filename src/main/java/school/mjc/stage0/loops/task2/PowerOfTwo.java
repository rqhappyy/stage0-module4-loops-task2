package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        int i = 0;
        int result = 1;
        if(power>=32||power<=0) {
            System.out.println("too much power");
        }else {
            while (i <= power) {
                result = (int) Math.pow(2.0, i);
                System.out.println(result);
                i++;
            }
        }
    }
}
