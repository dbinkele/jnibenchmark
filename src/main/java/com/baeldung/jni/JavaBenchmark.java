package com.baeldung.jni;

import java.util.stream.IntStream;

public class JavaBenchmark {

    public static final int UB = 10;

    static {
        System.out.println("Loading Native Lib!");
        System.loadLibrary("native");
    }

    public static void main(String[] args) {
        JavaBenchmark javaBenchmark = new JavaBenchmark();
        for (int i = 0; i< UB; i++){
            javaBenchmark.passNumber(1);
        }
        int result = javaBenchmark.sum();
        System.out.println("integer Sum is " + result);


        int[] numbers = new int[100];
        for (int i = 0; i< UB; i++){
            numbers[i] = 1;
        }
        int result2 = javaBenchmark.sumarray(numbers, UB);
        System.out.println("integer Sum is " + result2);

    }

    // Declare a native method
    public native void passNumber(int number);

    public native int sum();

    public native int sumarray(int[] numbers, int pos);
}