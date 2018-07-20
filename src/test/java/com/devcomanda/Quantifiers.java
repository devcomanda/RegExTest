package com.devcomanda;

import org.junit.jupiter.api.Test;

import java.util.regex.Pattern;

class Quantifiers {

    @Test
    void matchWithCount() {
        String text = "Hello World!";
        String regEx = "\\w{5} \\w{5}!";

        System.out.println(Pattern.matches(regEx, text));
    }

    @Test
    void matchWithCountFromTo() {
        String text = "Hello World!";
        String regEx = "\\w{1,} \\w{1,5}!";

        System.out.println(Pattern.matches(regEx, text));
    }

    @Test
    void matchWithCountOneAndMore() {
        String text = "Hello World!";
        String regEx = "\\w+ \\w+!";

        System.out.println(Pattern.matches(regEx, text));
    }

    @Test
    void matchWithCountOneAndZero() {
        String text = "Hello World!";
        String regEx = "\\w+\\s?\\w+!";

        System.out.println(Pattern.matches(regEx, text));
    }

    @Test
    void matchWithCountZeroAndMore() {
        String text = "Hello World!";
        String regEx = "\\w* \\w*!";

        System.out.println(Pattern.matches(regEx, text));
    }
}
