package com.baeldung.jni;

import java.util.stream.IntStream;

public class JavaBenchmark {

    static {
        System.out.println("Loading Native Lib!");
        System.loadLibrary("native");
    }

    public static void main(String[] args) {
        JavaBenchmark javaBenchmark = new JavaBenchmark();
        IntStream.range(1, 10).forEach(javaBenchmark::passNumber);

    }

    // Declare a native method passNumber() that receives no arguments and returns void
    public native void passNumber(int number);
}