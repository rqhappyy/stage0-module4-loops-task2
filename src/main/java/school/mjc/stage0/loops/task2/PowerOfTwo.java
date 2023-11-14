package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        int i = 0;
        while(i<=power){
            if(power>=32){
                System.out.println("too much power");
                break;
            }
            System.out.println((int)Math.pow(2.0, i));
            i++;
        }
    }
}
