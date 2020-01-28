package com.smoothstack.jan2020.printthepatterns;

public class Patterns {

    // Character to print
    private static final String str = "*";

    // Whitespace
    private static final String whitespace = " ";

    public static void patternOne(final int n, final int indent) {
        if (n < 1) return;

        for (int i = 1; i <= n; i++) {
            System.out.println(
                    StringUtils.repeat(whitespace, indent)
                    + StringUtils.repeat(str, i) );
        }
    }

    public static void patternTwo(final int n, final int indent) {
        if (n < 1) return;

        for (int i = n; i > 0; i--) {
            System.out.println(
                    StringUtils.repeat(whitespace, indent)
                    + StringUtils.repeat(str, i) );
        }
    }

    public static void patternThree(final int n, final int indent) {
        if (n < 1) return;

        for (int i = 0; i < n; i++) {
            System.out.println(
                    StringUtils.repeat(whitespace, indent)
                    + StringUtils.repeat(whitespace, n-i-1)
                    + StringUtils.repeat(str, (2*i)+1) );
        }
    }

    public static void patternFour(final int n, final int indent) {
        if (n < 1) return;

        for (int i = n-1; i >= 0; i--) {
            System.out.println(
                    StringUtils.repeat(whitespace, indent)
                    + StringUtils.repeat(whitespace, n-i-1)
                    + StringUtils.repeat(str, (2*i)+1) );
        }
    }
}
