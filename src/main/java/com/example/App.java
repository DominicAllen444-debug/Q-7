package com.example;

public class App {
    public long reverseNumber(int number) {
        boolean negative = number < 0;
        long remaining = Math.abs((long) number);
        long reversed = 0;
        while (remaining > 0) {
            reversed = reversed * 10 + remaining % 10;
            remaining /= 10;
        }
        return negative ? -reversed : reversed;
    }

    public static void main(String[] args) {
        App app = new App();
        System.out.println("Reverse of 1234 = " + app.reverseNumber(1234));
    }
}
