package com.baeldung.jni;

import java.util.stream.IntStream;

public class JavaBenchmark {

    private static JavaBenchmark javaBenchmark = new JavaBenchmark();
    private static final int UB = 1000000;

    static {
        System.out.println("Loading Native Lib!");
        System.loadLibrary("native");
    }

    public static void main(String[] args) {

        long startTime = 0;
        long elapsedTime = 0;
        startTime = System.currentTimeMillis();
        for (int i = 0; i< UB; i++){
            javaBenchmark.passNumber(1);
        }
        int result = javaBenchmark.sum();
        elapsedTime = System.currentTimeMillis() - startTime;
        System.out.println("Time unbatched " + elapsedTime);
        System.out.println("integer Sum is " + result);

        int[] numbers = new int[UB];
        startTime = System.currentTimeMillis();
        for (int i = 0; i< UB; i++){
            numbers[i] = 1;
        }
        int result2 = javaBenchmark.sumarray(numbers, UB);
        elapsedTime = System.currentTimeMillis() - startTime;
        System.out.println("Time batched " + elapsedTime);
        System.out.println("integer Sum is " + result2);

    }

    // Declare a native method
    public native void passNumber(int number);

    public native int sum();

    public native int sumarray(int[] numbers, int pos);
}