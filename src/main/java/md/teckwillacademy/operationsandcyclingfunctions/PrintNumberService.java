package md.teckwillacademy.operationsandcyclingfunctions;

public class PrintNumberService {
    public static void main(String[] args) {
        //sum of the odd number from 0 to 1000

        int totalSum = 0;

        for (int iterator = 0; iterator <= 10000; iterator++){
            System.out.println("Iterator: " +iterator);

            if (iterator % 2 == 1){
                totalSum = totalSum + iterator;
                // totalSum = totalSum + iterator;
                System.out.println("Total sum: " + totalSum);

            }
        }
        System.out.println("Total sum last one:" + totalSum);
    }
}
