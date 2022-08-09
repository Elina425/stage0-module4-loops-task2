package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int i = 2;
        int count =0;
        while(i<=printToInclusive/2){
            if(printToInclusive%i==0){
                count++;
                break;
            }
            System.out.println(count);
            i++;
        }
    }
}
