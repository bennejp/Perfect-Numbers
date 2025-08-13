/*This app alows users to determine all perfect numbers lower than their input*/

import java.util.ArrayList;
import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner inputScan = new Scanner(System.in);
        System.out.println("Enter number");
        String limitString = inputScan.nextLine();
        try {
        int limit = Integer.parseInt(limitString);
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
        inputScan.close();
        System.err.println(perfectnumbers);
    } catch (NumberFormatException e ) {
        System.err.println("Input must be an integer");
    }

    }
}