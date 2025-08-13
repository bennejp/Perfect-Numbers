/*This app alows users to determine all perfect numbers lower than their input*/

import java.util.ArrayList;

public class PerfectNumber {
    public static void main(String[] args) {
       int limit = 6;
       ArrayList<Integer> divisors = new ArrayList<>();
       ArrayList<Integer> perfectnumbers = new ArrayList<>();

       for (int i = 6; i <= limit; i++) { // checks all numbers from 6 to limit
            int sum = 0; 

            for (int j = 1; j <= i - 1; j++) { 
                if (i % j == 0) { // stores divisors excluding 1 and limit
                    divisors.add(j);
                }
            }

            for (int num : divisors) {
                sum += num;
            }

            if (sum == i) {
                perfectnumbers.add(i);
            }

            divisors.clear();
        }

        System.out.println(perfectnumbers);
        System.out.println(divisors);
    }
}