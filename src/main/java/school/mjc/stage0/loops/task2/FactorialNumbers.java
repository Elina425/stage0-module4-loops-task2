package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
            int count =1;
            int sum =1;
            while(count<=printToInclusive){
                sum*=count;
                System.out.println(sum);
                count++;
            }
    }
}
