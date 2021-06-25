package com.Bridglab.programs
import java.util.Scanner;
import com.bridgebaz.utility.Utility
public class PerfectNumber {
	
	public static void main(String[] args) {
		Utility utility = new Utility();
        	Scanner s = new Scanner(System.in);
        	int num1 = utility.getIntValue();
        	int perfectNum = perfectNumber(num);
        	if (perfectNum == num){
            		System.out.println(num + " is a perfect number.");
        	}else{
           		System.out.println(num + " is not a perfect number.");
	     	}     
   	 }
   	 	int num = utility.getIntValue();
 	 	utility.perfectNumber(num);
