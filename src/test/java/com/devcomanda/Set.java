package com.devcomanda;

import org.junit.jupiter.api.Test;

import java.util.regex.Pattern;

class Set {

    @Test
    void matchWithSet() {
        String text = "AA1BB";
        String regEx = "AA[0123456789]BB";

        System.out.println(Pattern.matches(regEx, text));
    }

    @Test
    void matchWithRange() {
        String text = "AA1BB";
        String regEx = "AA[0-9]BB";

        System.out.println(Pattern.matches(regEx, text));
    }

    @Test
    void matchWithNoRange() {
        String text = "AA1BB";
        String regEx = "AA[^5-9]BB";

        System.out.println(Pattern.matches(regEx, text));
    }
}
