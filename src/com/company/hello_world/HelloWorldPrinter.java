package com.company.hello_world;

public class HelloWorldPrinter {

    public static void printHelloWorld() {
        final String WORD = "hello world";
        int capLetterIndex = 0;
        while (true) {
            for (int i = 0; i < WORD.length(); ++i) {
                if (i == capLetterIndex) {
                    System.out.print((char) (WORD.charAt(i) - 32));
                } else {
                    System.out.print(WORD.charAt(i));
                }
            }
            if (capLetterIndex == WORD.length() - 1) {
                capLetterIndex = 0;
            } else {
                ++capLetterIndex;
            }
            System.out.println();
        }
    }
}

