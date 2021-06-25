package com.Bridglab.programs
import java.util.Scanner;
import com.bridgebaz.utility.Utility
public class ReverseNumber {
    public static void main(String[] args) {
        Utility utility = new Utility();
        Scanner s = new Scanner(System.in);
        int num = utility.getIntValue();
        int reverse = reverseNumber(num);
        System.out.println("Reverse number is: " + reverse);
        utility.reverseNumber(num);
    }
