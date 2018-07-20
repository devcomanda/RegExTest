package com.devcomanda;

import org.junit.jupiter.api.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class GreedyAndLazy {

    @Test
    void findWordGreedyAndLazy() {
        String text = "Hello World";

        Pattern pattern = Pattern.compile("\\w+ \\w+?");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }

    @Test
    void findSubStringGreedy() {
        String text = "I want learn \"Java 8\" and \"JavaScript 2018\"";

        Pattern pattern = Pattern.compile("\".+\"");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }

    @Test
    void findSubStringLazy() {
        String text = "I want learn \"Java 8\" and \"JavaScript 2018\"";

        Pattern pattern = Pattern.compile("\".+?\"");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
