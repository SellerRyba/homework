package Homework.module7;

import java.util.Arrays;

class DigitExtracterTest {
    public static void main(String[] args) {
        DigitExtracter digitExtracter = new DigitExtracter();

        int[] extracted = digitExtracter.extract("april 5, year 2000");

        //[5, 2, 0, 0, 0]
        System.out.println(Arrays.toString(extracted));
    }
}
class DigitExtracter{
    public int[] extract(String text){
        String str = text.replaceAll("[^0-9]", "");
        String strNew = "";
        char [] chars = str.toCharArray();
        int [] result = new int[chars.length];
        for (int i = 0; i < chars.length; i++) {
            strNew += chars[i] + " ";
        }
        String [] arr = strNew.split(" ");
        for (int i = 0; i < arr.length; i++) {
            result [i] = Integer.parseInt(arr[i]);
        }

        return result;
    }
}
