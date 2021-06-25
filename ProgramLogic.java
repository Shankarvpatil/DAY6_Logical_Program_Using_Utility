package com.Bridglab.programs
import java.util.Scanner;
import com.bridgebaz.utility.Utility

public class Fibonacci {
    public static void main(String[] args) {
        Utility utility = new Utility();
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number of series you want : ");
        int num = s.nextInt();
        utility.fibonacci(num);
    }
