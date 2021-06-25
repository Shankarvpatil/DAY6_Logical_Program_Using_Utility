package com.Bridglab.programs
import java.util.Scanner;
import com.bridgebaz.utility.Utility
public class PrimeNumber {
    public static void main(String[] args) {
    	Utility utility = new Utility();
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = s.nextInt();
        utility.isPrime(num);
    }
