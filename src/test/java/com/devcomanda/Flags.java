package com.devcomanda;

import org.junit.jupiter.api.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Flags {

    @Test
    void matchString() {
        String text = "Hello World!";
        String regEx = "Hello World!";

        System.out.println(Pattern.matches(regEx, text));
    }

    //CASE_INSENSITIVE or (?i)
    @Test
    void matchIgnoreCaseString() {
        String text = "Hello World!";
        String regEx = "(?i)Hello world!";

        System.out.println(Pattern.matches(regEx, text));
    }

}
