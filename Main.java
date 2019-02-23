package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        int isMultiple = 0;
        for (int i = 3; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0){
                isMultiple += i;
            }
        }
        System.out.printf("The sum of all multiples is: %d", isMultiple);
    }
}
