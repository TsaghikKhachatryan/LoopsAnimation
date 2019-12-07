package com.company.dashes;

public class DashPrinter {

    public static void printDashes() {
        char[] arr = {'|', '/', '-', '\\'};
        while (true) {
            for (char c : arr) {
                System.out.println(c);
            }
        }
    }
}
