package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        double result = Math.pow(2,power);
            while(result>1){
                if(power<0){
                    System.out.println("too much power");
                }
                System.out.println(result);
                power++;
            }
    }
}
