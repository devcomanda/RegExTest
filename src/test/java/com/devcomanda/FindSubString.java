package com.devcomanda;

import org.junit.jupiter.api.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class FindSubString {

    @Test
    void findSubString() {
        String text = "Hello my World!!!";
        String regEx = "\\b\\w+\\b";

        Pattern pattern = Pattern.compile(regEx);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }

    @Test
    void searchSubStringInMultiRows() {
        String text = "Hello World1\nHello World2\nHello World3";
        String regEx = "Hello World.";

        Pattern pattern = Pattern.compile(regEx);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }

    @Test
    void searchSubStringInMultiRowsStartAndEndRow() {
        String text = "Hello World1\nHello World2\nHello World3";
        String regEx = "^Hello World.$";

        Pattern pattern = Pattern.compile(regEx);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }

    //MULTILINE or (?m)
    @Test
    void searchSubStringInMultiRowsWithFilter() {
        String text = "1\nHello World1\nHello World2\nHello World3";

        Pattern pattern = Pattern.compile("(?m)^Hello World.$");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group());
            System.out.println(matcher.start());
            System.out.println(matcher.end());
        }
    }
}
