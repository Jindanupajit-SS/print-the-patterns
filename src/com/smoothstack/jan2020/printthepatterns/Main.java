package com.smoothstack.jan2020.printthepatterns;

public class Main {

    public static void main(String[] args) {

        System.out.println("1)");
        Patterns.patternOne(4, 0);
        System.out.println(StringUtils.repeat(".", 9));

        System.out.println("2)");
        System.out.println(StringUtils.repeat(".", 10));
        Patterns.patternTwo(4, 0);


        System.out.println("3)");
        Patterns.patternThree(4, 2);
        System.out.println(StringUtils.repeat(".", 11));

        System.out.println("4)");
        System.out.println(StringUtils.repeat(".", 12));
        Patterns.patternFour(4, 2);

    }
}
