package com.smoothstack.jan2020.printthepatterns;

public class StringUtils {

    public static String repeat(final String str, final int n) {
        if (n < 1)
            return "";
        else
            return new String(new char[n]).replace("\0",str);
    }
}
