package com.devcomanda;

import org.junit.jupiter.api.Test;

import java.util.regex.Pattern;

class SpecialSymbols {

    @Test
    void matchChars() {
        String text = "Hello World!";
        String regEx = "\\w\\w\\w\\w\\w \\w\\w\\w\\w\\w!";

        System.out.println(Pattern.matches(regEx, text));
    }

    @Test
    void matchDigital() {
        String text = "+38(060)153-56-94";
        String regEx = "\\+\\d\\d\\(\\d\\d\\d\\)\\d\\d\\d-\\d\\d-\\d\\d";

        System.out.println(Pattern.matches(regEx, text));
    }

    @Test
    void matchSpace() {
        String text = "H e ll\to  Wor\t\tld!";
        String regEx = "H\\se\\sll\\so\\s\\sWor\\s\\sld!";

        System.out.println(Pattern.matches(regEx, text));
    }

    @Test
    void matchBorderWords() {
        String text = "Hello World!";
        String regEx = "\\bHello\\b \\bWorld\\b!";

        System.out.println(Pattern.matches(regEx, text));
    }

    @Test
    void matchAnySymbol() {
        String text = "777";
        String regEx = "...";

        System.out.println(Pattern.matches(regEx, text));
    }

    @Test
    void matchSpecSymbols() {
        String text = ".\\(w)";
        String regEx = ".\\\\\\(\\w\\)";

        System.out.println(Pattern.matches(regEx, text));
    }


}
