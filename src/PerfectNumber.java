/*This app alows users to determine all perfect numbers lower than their input*/

import java.util.ArrayList;

public class PerfectNumber {
    public static void main(String[] args) {
       int limit = 21000;
       ArrayList<Integer> perfectnumbers = new ArrayList<>();

       for (int i = 6; i <= limit; i++) { // loops all numbers from 6 to limit
            int sum = 0; 

            for (int j = 1; j <= i - 1; j++) { 
                if (i % j == 0) { // adds divisors excluding limit
                    sum += j;
                }
            }

            if (sum == i) {
                perfectnumbers.add(i);
            }

        }

        System.out.println(perfectnumbers);
    }
}