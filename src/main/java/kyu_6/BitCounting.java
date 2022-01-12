package kyu_6;

public class BitCounting {
    public static int countBits(int n){

        String[] binary = Integer.toBinaryString(n).split("");
        int count =0;

        for(String number : binary){
            if (number.equals("1")){
                count++;
            }
        }
        return count;
    }
}