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
            i++;
        }
        if (count == 0) {
            System.out.println(printToInclusive );
        }
    }
}
