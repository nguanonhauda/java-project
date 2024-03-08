package com.mycompany.app.Week1;

//package com.mycompany.app.Week1;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Nhập số lượng số Fibonacci cần hiển thị: ");
            int n = scanner.nextInt();
            printFibonacci(n);
        }
    }

    public static void printFibonacci(int n) {
        long t1 = 1, t2 = 1;
        System.out.print("Dãy Fibonacci: ");
        for (int i = 1; i <= n; ++i) {
            System.out.print(t1);
            if (i < n) {
                System.out.print(", ");
            }
            long sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
        System.out.println();
    }
}

