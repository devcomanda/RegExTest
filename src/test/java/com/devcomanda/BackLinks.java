package com.devcomanda;

import org.junit.jupiter.api.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class BackLinks {

    @Test
    void changePlaceWord() {
        String text = "Hello World!!!";
        String regEx = "(\\w+)\\s(\\w+)";

        System.out.println(text.replaceAll(regEx, "$2 $1"));
    }

    @Test
    void findSubStringWithBackLinks() {
        String text = "I like books \"O'Reilly\"";
        String regEx = "(['\"]).+?\\1";

        Pattern pattern = Pattern.compile(regEx);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
