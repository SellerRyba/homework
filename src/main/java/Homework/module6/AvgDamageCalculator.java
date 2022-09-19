package Homework.module6;

class AvgDamageCalculator {
    public int calculateAvg(int[] samples) {
        int sum = 0;
        for(int sampleValue: samples) {
            sum += sampleValue;
        }
        try {
            sum /= samples.length;
        }catch (ArithmeticException e){
            return 0;
        }
        return sum;
    }
}

class AvgDamageCalculatorTest {
    public static void main(String[] args) {
        //5
        System.out.println(new AvgDamageCalculator().calculateAvg(new int[] {2, 4, 6, 8}));

        //0
        System.out.println(new AvgDamageCalculator().calculateAvg(new int[0]));
    }
}
