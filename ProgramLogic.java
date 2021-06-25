package com.Bridglab.programs
import java.util.Scanner;
import com.bridgebaz.utility.Utility
public class PrimeNumber {
    public static void main(String[] args) {
    	Utility utility = new Utility();
        Scanner s = new Scanner(System.in);
        int num = utility.getIntValue();
        utility.isPrime(num);
    }
