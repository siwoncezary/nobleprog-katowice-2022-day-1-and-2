package pl.vattenfall.exception;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.io.IOException;

public class ExceptionDemo {

    public static int methodA(int a, int b){
        return a / b;
    }

    public static double methodB(double a, double b){
        return a / b;
    }

    public static long methodC(long a, long b) throws IOException {
        return a / b;
    }

    public static void main(String[] args) throws IOException {
        try {
            System.out.println(methodA(1, 0));
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        double a = 10d;
        float b = 10.0f;
        long c = 10L;
        byte d = 123;
        short e =32_000;
        char f = 'a';
        char g = '\010';
        String str ="abcd";
        System.out.println(str.codePointAt(0));
        System.out.println(10 * methodB(1, 0));
        if (0.0 / 0.0 == 0d / 0d){
            System.out.println("Równe");
        } else {
            System.out.println("Nierówne");
        }
        methodC(1,1);
    }
}
