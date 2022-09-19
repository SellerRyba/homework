package Homework.module7;

class NumberJoiner {
    public String join(int[] numbers) {
        StringBuilder results = new StringBuilder();
        for(int number: numbers) {
           results.append(number);
        }
        return String.valueOf(results);
    }
}

class NumberJoinerTest {
    public static void main(String[] args) {
        //102030
        System.out.println(new NumberJoiner().join(new int[] {10, 20, 30}));
    }
}
