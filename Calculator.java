package com.my.util;

public class Calculator {

    private static double result;

    public void add(double n) {
        result += n;
    }

    public void subtract(double n) {
        result -= n;
    }

    public void multiply(double n) {
        result *= n;
    }

    public void divide(double n) {
        if(n == 0) {
            System.out.println("被除数不能为0");
        } else {
            result /= n;
        }
    }

    public void clear() {
        // 清零
        result = 0;
    }

    public double getResult() {
        return result;
    }
}
