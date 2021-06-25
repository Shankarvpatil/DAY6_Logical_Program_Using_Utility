package com.bridgebaz.utility;

import java.util.Scanner;

public class Utility {
	Scanner scanner;
	public Utility() {
		scanner = new Scanner(System.in);
	}
	// get integer input
	public int getIntValue() {
		return scanner.nextInt();
	}
  //Fibonacci Series
  private static void fibonacci(int num) {
        int n = num;
        int a = 0;
        int b = 1;
        System.out.print(a + " ");
        System.out.print(b + " ");
        int i = 1;
        while (i<=num-2) {
            int c = a+b;
            a = b;
            b = c;
            System.out.print(c + " ");
            i++;
        }
    }
}
//perfect Number
 private static int perfectNumber(int num) {
        int i = 1;
        int sum = 0;
        for (i=1; i<num/2; i++) {
            if (num % i == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }
//Prime Number
private static void isPrime(int num) {
        int i = 2, count = 0;
        if (num == 1 || num == 0) {
            count++;
            System.out.println(num + " is not a prime number.");
        } else {
            while(i<=num/2) {
                if (num%i == 0) {
                    count++;
                }
                i++;
            }
            if (count == 0)
                System.out.println(num + " is prime number");
            else
                System.out.println(num + " is not a prime number.");
        }

    }
//Reverse Number
private static int reverseNumber(int num) {
        int rem = 0;
        int rev = 0;
        int temp = num;

        while (temp > 0) {
            rem = temp % 10;
            rev = rev * 10 + rem;
            temp = temp /10;
        }
        return rev;
    }
//Stop watch program
public void getElapsTime() {
		int choice=0;
	    double start=0, stop=0;
        do {
            System.out.println("1. Start");
            System.out.println("2. Stop");
            choice = getIntValue();
            switch(choice) {
       			case 1:
       				start = System.currentTimeMillis();
       				System.out.println("You have started the stopwatch please select stop now");
       				break;
       			case 2:
       				stop = System.currentTimeMillis();
       				break; 
            }
       }
	while(choice != 2);
       double elaps = ((stop - start)/1000)%60;
       System.out.println("Elaps time = "+elaps+" sec");	
	}
}

public static void getCoupons(int noOfcoupns, int sizeOfCoupon) {
		int cnt = 0;
		String str1 = "";
		String coupns = "";
		while(cnt != noOfcoupns) {
			str1 = generateCoupons(sizeOfCoupon);
			if(!coupns.contains(str1)) {
				coupns += str1;
				cnt++;
				System.out.println("coupon"+cnt+" =  "+str1);
			}
		}
		
	}

	//generate random your coupons

	public static String generateCoupons(int sizeOfCoupon) {
		String str = "";
		Random random = new Random();
			for(int i=0; i<sizeOfCoupon; i++) {
				int num = random.nextInt(10);
				str += ""+num;
			}
		return str;
	}

